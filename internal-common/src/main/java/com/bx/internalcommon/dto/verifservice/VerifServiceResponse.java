package com.bx.internalcommon.dto.verifservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerifServiceResponse implements Serializable {

    private String verifCode;
}
