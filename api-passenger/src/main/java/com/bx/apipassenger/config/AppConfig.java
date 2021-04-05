package com.bx.apipassenger.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(new LoggingClientHttpRequestInterceptor());
        return restTemplate;
    }
}
