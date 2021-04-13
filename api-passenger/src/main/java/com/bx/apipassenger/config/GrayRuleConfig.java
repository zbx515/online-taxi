package com.bx.apipassenger.config;

import com.bx.apipassenger.gray.GrayRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

public class GrayRuleConfig {

    @Bean
    public IRule ribbonRule(){
        return new GrayRule();
    }
}
