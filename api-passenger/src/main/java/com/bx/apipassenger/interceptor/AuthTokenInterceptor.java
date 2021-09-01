package com.bx.apipassenger.interceptor;

import com.bx.apipassenger.annotation.CheckToken;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import java.lang.reflect.Method;

public class AuthTokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        System.out.println("进入拦截器...");
        System.out.println(token);
        System.out.println(handler.getClass());
        //if(handler instanceof HandlerMethod){
            HandlerMethod mapping = (HandlerMethod) handler;
            Method method = mapping.getMethod();
            if (method.isAnnotationPresent(CheckToken.class)) {
                CheckToken annotation = method.getAnnotation(CheckToken.class);
                if (annotation.required()) {
                    System.out.println("检验token");
                }
            }
       // }
        return true;
    }
}
