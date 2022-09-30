package com.assetjp.demo_microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMicroservicesApplication.class, args);
    }

}
