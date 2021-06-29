package com.bx.zkdubborocketmq.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private String name;
    @Autowired
    private B b;
}
