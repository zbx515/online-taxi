package com.bx.servicecorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableJms
@EnableScheduling
public class ServicecOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicecOrderApplication.class, args);
    }

}
