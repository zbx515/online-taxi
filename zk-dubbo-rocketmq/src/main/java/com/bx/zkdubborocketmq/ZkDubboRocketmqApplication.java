package com.bx.zkdubborocketmq;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubboConfig
@SpringBootApplication
public class ZkDubboRocketmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkDubboRocketmqApplication.class, args);
    }

}
