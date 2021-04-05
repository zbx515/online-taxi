package com.bx.serviceverificationcode.controller;

import com.bx.internalcommon.dto.fegionapi.FeginApi;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class FeginTestController implements FeginApi {


    @RequestMapping("/getTest")
    public String getTest(@RequestParam("name") String name) {
        return name;
    }
}
