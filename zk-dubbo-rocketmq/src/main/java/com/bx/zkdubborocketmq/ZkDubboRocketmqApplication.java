package com.bx.zkdubborocketmq;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class ZkDubboRocketmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkDubboRocketmqApplication.class, args);
    }

}
