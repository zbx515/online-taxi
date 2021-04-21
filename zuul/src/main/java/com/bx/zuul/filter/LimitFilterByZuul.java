package com.bx.zuul.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
/**
 * 基于网关的限流，其思想为  拿到令牌的继续执行  用过滤器实现 似于多线程中的信号量semaphore
 * 服务与服务之间的限流 也是这种思想 用Filter实现
 */
@Component
public class LimitFilterByZuul extends ZuulFilter {

    private static RateLimiter LIMIT = RateLimiter.create(1);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return -10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        if(LIMIT.tryAcquire()){
            return null;
        }else{
            System.out.println("被限流了..");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(HttpStatus.TOO_MANY_REQUESTS.value());
        }
        return null;
    }
}
