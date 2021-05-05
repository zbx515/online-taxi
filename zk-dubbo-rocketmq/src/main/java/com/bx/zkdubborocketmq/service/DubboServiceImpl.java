package com.bx.zkdubborocketmq.service;

import com.bx.internalcommon.dto.dubbo.DubboService;

@org.apache.dubbo.config.annotation.DubboService(interfaceClass = DubboService.class)
public class DubboServiceImpl implements DubboService {
    @Override
    public String sayHello(String message) {
        return message;
    }
}
