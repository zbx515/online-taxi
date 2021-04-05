package com.bx.servicesms.controller;

import com.bx.internalcommon.dto.ResponseResult;
import com.bx.internalcommon.dto.verifservice.VerifCodeEntity;
import com.bx.servicesms.service.SendSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendsms")
public class SendSmsController {

    @Autowired
    private SendSmsService sendSmsService;

    @RequestMapping("/send")
    public ResponseResult send(@RequestBody VerifCodeEntity verifCodeEntity){
        String phoneNumber = verifCodeEntity.getPhoneNumber();
        String verifCode = verifCodeEntity.getVerifCode();
        //发送短信的动作，然后返回
        return sendSmsService.send(phoneNumber,verifCode);
    }
}
