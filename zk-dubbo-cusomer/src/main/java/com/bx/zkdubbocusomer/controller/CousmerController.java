package com.bx.zkdubbocusomer.controller;

import com.bx.zkdubbocusomer.service.DubboCousmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CousmerController {

    @Autowired
    private DubboCousmer dubboCousmer;

    @RequestMapping("/hello/{message}")
    public String sayHello(@PathVariable("message") String message){
        return dubboCousmer.sayHello(message);
    }
}
