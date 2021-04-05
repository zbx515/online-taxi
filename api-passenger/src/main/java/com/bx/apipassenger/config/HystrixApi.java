package com.bx.apipassenger.config;


import com.bx.apipassenger.controller.FeginApi;
import org.springframework.stereotype.Component;

@Component
public class HystrixApi implements FeginApi {
    @Override
    public String getTest(String name) {
        return "降级了";
    }
}
