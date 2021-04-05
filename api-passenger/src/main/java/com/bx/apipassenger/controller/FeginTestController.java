package com.bx.apipassenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginTestController {

    @Autowired
    FeginApi feginApi;

    @RequestMapping("/get")
    public String getTest(@RequestParam("name") String name){
        return feginApi.getTest(name);
    }


}
