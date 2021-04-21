package com.bx.zuul.filter;


import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 基于网关的限流，其思想为  拿到令牌的继续执行  用过滤器实现 似于多线程中的信号量semaphore
 * 服务与服务之间的限流 也是这种思想 用Filter实现
 */
@Component
public class LimitFilter implements Filter {

    private static RateLimiter  LIMIT = RateLimiter.create(1);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        if(LIMIT.tryAcquire()){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            servletResponse.setCharacterEncoding("utf-8");
            servletResponse.setContentType("text/html charset=utf-8");
            PrintWriter writer = servletResponse.getWriter();
            writer.write("限流了...");
            writer.close();
        }
    }
}
