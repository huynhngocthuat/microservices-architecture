package com.assetjp.config_client.controllers;

import com.assetjp.config_client.config.ClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Autowired
    private ClientConfig clientConfig;
    @Value("${sample.property2}")
    private String property2;

    @RequestMapping("/config")
    public String printConfig() {
        return clientConfig.getProperty1() + "HNT" + property2;
    }
}
