package com.bx.serviceverificationcode.service;

import com.bx.internalcommon.dto.verifservice.VerifServiceResponse;

public interface VerifService {
    VerifServiceResponse sendCode(int identity, String phoneNumber);

    VerifServiceResponse verifCode(int identity,String phoneNumber,String verifCode);
}
