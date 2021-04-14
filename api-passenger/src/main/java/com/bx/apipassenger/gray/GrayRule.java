package com.bx.apipassenger.gray;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import com.netflix.niws.loadbalancer.DiscoveryEnabledServer;

import java.util.List;
import java.util.Map;

/**
 * 基于Ribbon的灰度发布
 *
 */
public class GrayRule extends AbstractLoadBalancerRule {

    @Override
    public Server choose(Object o) {
        return choose(getLoadBalancer(),o);
    }

    /**
     * 自定义选择服务
     * @param lb
     * @param o
     * @return
     */
    public Server choose(ILoadBalancer lb, Object o){
        Server server = null;
        Map<String,String> param =GrayParamaaters.get();
        //用户传进来的version
        String version = param.get("version");
        while(server == null){
            List<Server> reachableServers = lb.getReachableServers();
            for (int i = 0; i <reachableServers.size() ; i++) {
                server = reachableServers.get(i);
                Map<String, String> metadata = ((DiscoveryEnabledServer) server).getInstanceInfo().getMetadata();
                if(version.trim().equals(metadata.get("version"))){
                    return server;
                }
            }
        }
        return null;
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }
}
