package com.bx.apipassenger.controller;

import com.bx.apipassenger.config.FeifnFallBackFactory;
import com.bx.apipassenger.config.HystrixApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-verification-code",fallbackFactory = FeifnFallBackFactory.class)
public interface FeginApi extends com.bx.internalcommon.dto.fegionapi.FeginApi {
    @RequestMapping("/user/getTest")
    String getTest(@RequestParam("name") String name);
}
