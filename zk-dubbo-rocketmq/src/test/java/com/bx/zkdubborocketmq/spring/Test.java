package com.bx.zkdubborocketmq.spring;

import com.fasterxml.classmate.AnnotationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.bx.zkdubborocketmq.spring");
        A bean = applicationContext.getBean(A.class);
        System.out.println(bean);
    }
}
