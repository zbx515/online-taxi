package com.bx.serviceverificationcode.controller;

import com.bx.internalcommon.dto.ResponseResult;
import com.bx.internalcommon.dto.verifservice.VerifServiceResponse;
import com.bx.serviceverificationcode.service.VerifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/verif")
public class VerifController {

    @Autowired
    VerifService verifService;

    @GetMapping("/generte/{identity}/{phoneNumber}")
    public ResponseResult<VerifServiceResponse> geneter(@PathVariable("identity") int identity,@PathVariable("phoneNumber") String phoneNumber){
        return new ResponseResult().setData(verifService.sendCode(identity,phoneNumber));
    }


    @GetMapping("/generte/{identity}/{phoneNumber}/{verifCode}")
    public ResponseResult<VerifServiceResponse> verifyCode(@PathVariable("identity") int identity,@PathVariable("phoneNumber") String phoneNumber,@PathVariable("verifCode") String verifCode){
        return new ResponseResult().setData(verifService.verifCode(identity,phoneNumber,verifCode));
    }

}
