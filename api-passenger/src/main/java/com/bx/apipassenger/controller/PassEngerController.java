package com.bx.apipassenger.controller;

import com.bx.apipassenger.service.RestHystrixService;
import com.bx.internalcommon.dto.ResponseResult;
import com.bx.internalcommon.dto.verifservice.VerifCodeEntity;
import com.bx.internalcommon.dto.verifservice.VerifServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * 用户登录
 */
@RestController
@RequestMapping("/passenger")
public class PassEngerController {

    public static  final String SERVICE_VERIFICATION_CODE_URL = "http://SERVICE-VERIFICATION-CODE";
    public static  final String SERVICE_SMS_URL = "http://SERVICE-SMS";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    RestHystrixService restHystrixService;

    @GetMapping("/send/{phoneNumber}")
    public ResponseResult send(@PathVariable("phoneNumber") String phoneNumber){
        ResponseResult responseResult1 = restTemplate.getForObject(SERVICE_VERIFICATION_CODE_URL + "/verif/generte/1/" + phoneNumber, ResponseResult.class);
        int statusCodeValue = responseResult1.getCode();
        if(statusCodeValue == 1 ){
            //获取返回的验证码
            Map data = (Map)responseResult1.getData();
            String verifCode = (String) data.get("verifCode");
            //调用短信服务发送验证码
            VerifCodeEntity verifCodeEntity = new VerifCodeEntity();
            verifCodeEntity.setPhoneNumber(phoneNumber);
            verifCodeEntity.setVerifCode(verifCode);
            ResponseResult postForObject = restTemplate.postForObject(SERVICE_SMS_URL + "/sendsms/send", verifCodeEntity, ResponseResult.class);
            return postForObject;
        }
        return null;
    }

    @GetMapping("/send/checkCode/{phoneNumber}/{verifCode}")
    public ResponseResult checkCode(@PathVariable("phoneNumber")String phoneNumber,@PathVariable("verifCode")String verifCode){
        ResponseResult responseResult1 = restTemplate.getForObject(SERVICE_VERIFICATION_CODE_URL + "/verif/generte/1/" + phoneNumber+"/"+verifCode, ResponseResult.class);
        return responseResult1;
    }

    @RequestMapping("/getRest")
    public String test(@RequestParam("name") String name){
        return restHystrixService.get(name);
    }


    @RequestMapping("/test")
    public String testsms(){
        String result = restTemplate.getForObject(SERVICE_SMS_URL + "/sendsms/test", String.class);
        return result;
    }
}
