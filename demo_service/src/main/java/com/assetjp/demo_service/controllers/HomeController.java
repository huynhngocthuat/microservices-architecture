package com.assetjp.demo_service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${service.instance.name}")
    private String instance;

    @RequestMapping("/")
    public String sayHello(){
        return "Hello from " + instance;
    }
}
