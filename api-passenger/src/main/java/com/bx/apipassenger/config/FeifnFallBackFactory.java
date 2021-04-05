package com.bx.apipassenger.config;

import com.bx.apipassenger.controller.FeginApi;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeifnFallBackFactory implements FallbackFactory<FeginApi> {
    @Override
    public FeginApi create(Throwable cause) {
        return new FeginApi() {
            @Override
            public String getTest(String name) {
                System.out.println(cause);
                System.out.println(ToStringBuilder.reflectionToString(cause));
                return "呵呵";
            }
        };
    }
}
