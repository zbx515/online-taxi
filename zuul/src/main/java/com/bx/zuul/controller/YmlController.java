package com.bx.zuul.controller;

import com.bx.zuul.yml.MyYml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlController {

    @Autowired
    private MyYml myYml;

    @RequestMapping("/get")
    public String getYml(){
        return myYml.getData();
    }
}
