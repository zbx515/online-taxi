package com.bx.servicesms.service;

import com.bx.internalcommon.dto.ResponseResult;

public interface SendSmsService {
    ResponseResult send(String phoneNumber,String verifCode);
}
