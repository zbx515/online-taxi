package com.bx.zkdubbocusomer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bx.internalcommon.dto.dubbo.DubboService;
import org.springframework.stereotype.Component;

@Component
public class DubboCousmer {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private DubboService dubboService;

    public String sayHello(String message){
        return dubboService.sayHello(message);
    }
}
