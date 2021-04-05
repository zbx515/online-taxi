package com.bx.servicesms.service.impl;

import com.bx.internalcommon.dto.ResponseResult;
import com.bx.servicesms.service.SendSmsService;
import org.springframework.stereotype.Service;

@Service
public class SendSmsServiceImpl implements SendSmsService {
    @Override
    public ResponseResult send(String phoneNumber, String verifCode) {
        System.out.println("发送短信：phoneNumber "+phoneNumber+"  verifCode: "+verifCode);
        return new ResponseResult(1,"success");
    }
}
