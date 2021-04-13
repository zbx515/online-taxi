package com.bx.apipassenger;

import com.bx.apipassenger.config.GrayRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
@RibbonClient(name="SERVICE-SMS",configuration = GrayRuleConfig.class)
public class ApiPassengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiPassengerApplication.class, args);
    }

}
