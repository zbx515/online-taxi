package com.bx.apipassenger.service;

import com.bx.internalcommon.dto.ResponseResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestHystrixService {

    public static  final String SERVICE_VERIFICATION_CODE_URL = "http://SERVICE-VERIFICATION-CODE";
    public static  final String SERVICE_SMS_URL = "http://SERVICE-SMS";

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(defaultFallback = "back")
    public String get(String name){
        String responseResult1 = restTemplate.getForObject(SERVICE_VERIFICATION_CODE_URL + "/user/getTest/?name="+name, String.class);
        return responseResult1;
    }

    public String back(){
        return "hehe";
    }
}
