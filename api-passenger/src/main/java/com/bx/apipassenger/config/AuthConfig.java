package com.bx.apipassenger.config;

import com.bx.apipassenger.interceptor.AuthTokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getAuthTokenInterceptor()).addPathPatterns("/passenger/**");
    }

    @Bean
    public AuthTokenInterceptor getAuthTokenInterceptor() {
        return new AuthTokenInterceptor();
    }
}