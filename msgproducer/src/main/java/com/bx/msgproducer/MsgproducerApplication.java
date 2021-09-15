package com.bx.msgproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MsgproducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsgproducerApplication.class, args);
    }

}
