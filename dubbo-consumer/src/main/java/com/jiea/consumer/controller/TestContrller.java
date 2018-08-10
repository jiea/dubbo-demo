package com.jiea.consumer.controller;

import com.jiea.api.remote.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestContrller {

    @Resource
    private HelloWorldService helloWorldService;

    @GetMapping("test")
    public String test(){
        String name = helloWorldService.getName();
        System.out.println(name);
        return name;
    }
}
