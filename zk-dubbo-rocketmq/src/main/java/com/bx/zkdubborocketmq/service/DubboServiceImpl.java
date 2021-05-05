package com.bx.zkdubborocketmq.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bx.internalcommon.dto.dubbo.DubboService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = DubboService.class)
public class DubboServiceImpl implements DubboService {
    @Override
    public String sayHello(String message) {
        return "我是你爸爸，哈哈哈："+message;
    }
}
