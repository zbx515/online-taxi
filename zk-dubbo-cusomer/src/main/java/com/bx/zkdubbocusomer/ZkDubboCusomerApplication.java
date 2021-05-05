package com.bx.zkdubbocusomer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ZkDubboCusomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkDubboCusomerApplication.class, args);
    }



}
