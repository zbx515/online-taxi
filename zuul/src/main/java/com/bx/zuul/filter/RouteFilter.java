package com.bx.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 需求
 * 如果遇到老项目改造，对外的提供的地址不能变，但是提供方没有对应的服务URL 那么就需要进行地址的转换
 * 通过自定义路由来实现
 * 核心思想  还是转发
 */
@Component
public class RouteFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取当前请求的URL
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String requestURI = request.getRequestURI();
        System.out.println("请求的地址： "+requestURI);
        //判断是否为需要进行转发 的请求地址
        if(requestURI.contains("/sendsms/test3")){
            //设置转发的服务ID
            currentContext.set(FilterConstants.SERVICE_ID_KEY,"service-sms");
            //设置转发的地址
            currentContext.set(FilterConstants.REQUEST_URI_KEY,"/sendsms/test4");
        }
        //不太合适待验证 设置为false则不走后边的过滤器   只对route过滤器生效
        //currentContext.setSendZuulResponse(false);

        return null;
    }
}
