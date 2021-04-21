package com.bx.zuul.filter;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 基于Sentinel的限流
 */
@Component
public class SentinelFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return -8;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        Entry entry = null;
        try {
            entry = SphU.entry("hello");
        }catch (BlockException e){
            System.out.println("Sentinel 阻塞住了..");
        }finally {
            if(entry != null){
                entry.exit();
            }
        }
        return null;
    }
}
