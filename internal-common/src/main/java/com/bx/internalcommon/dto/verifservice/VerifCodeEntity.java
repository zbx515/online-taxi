package com.bx.internalcommon.dto.verifservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifCodeEntity {
    //手机号
    private String phoneNumber;
    //验证码
    private String verifCode;
}
