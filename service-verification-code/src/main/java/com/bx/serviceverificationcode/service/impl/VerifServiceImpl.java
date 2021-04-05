package com.bx.serviceverificationcode.service.impl;

import com.bx.internalcommon.dto.verifservice.VerifServiceResponse;
import com.bx.serviceverificationcode.service.VerifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

@Service
public class VerifServiceImpl implements VerifService {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public VerifServiceResponse sendCode(int identity,String phoneNumber) {
        //生成随机验证码
        String verifCode = String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10, 5)));
        //将验证码放入redis中
        String key = identity+phoneNumber;
        redisTemplate.opsForValue().set(key,verifCode,2000, TimeUnit.SECONDS);

        VerifServiceResponse verifServiceResponse = new VerifServiceResponse();
        verifServiceResponse.setVerifCode(verifCode);
        return verifServiceResponse;
    }

    @Override
    public VerifServiceResponse verifCode(int identity,String phoneNumber,String verifCode){
        //将验证码放入redis中
        String key = identity+phoneNumber;
        String s = redisTemplate.opsForValue().get(key);
        System.out.println("redis中的验证码: "+s);
        if(s == null){
            System.out.println("验证码已失效");
        }
        if(verifCode.equals(s)){
            System.out.println("正确");
        }else{
            System.out.println("验证码错误");
        }
        VerifServiceResponse verifServiceResponse = new VerifServiceResponse();
        verifServiceResponse.setVerifCode(verifCode);
        return verifServiceResponse;
    }
}
