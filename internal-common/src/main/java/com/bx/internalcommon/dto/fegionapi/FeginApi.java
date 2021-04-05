package com.bx.internalcommon.dto.fegionapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface FeginApi {

    @RequestMapping("/user/getTest")
    String getTest(String name);

}
