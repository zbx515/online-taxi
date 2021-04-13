package com.bx.apipassenger.gray;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Aspect
@Component
public class GrayAspect {

    @Pointcut(value = "execution(* com.bx.apipassenger.controller..*Controller*.*(..))")
    public void method(){}

    @Before(value = "method()")
    public void before(JoinPoint joinPoint){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String version = request.getHeader("version");
        System.out.println("请求的version："+version);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("version",version);
        GrayParamaaters.set(hashMap);
    }
}
