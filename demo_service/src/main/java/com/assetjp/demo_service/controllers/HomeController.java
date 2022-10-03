package com.assetjp.demo_service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoService")
public class HomeController {

    @Value("${service.instance.name}")
    private String instance;

    @GetMapping()
    public String sayHello() {
        return "Hello from " + instance;
    }
}
