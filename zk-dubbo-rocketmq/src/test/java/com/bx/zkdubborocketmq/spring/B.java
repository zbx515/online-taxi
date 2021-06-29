package com.bx.zkdubborocketmq.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private String name;
    @Autowired
    private A a;
}
