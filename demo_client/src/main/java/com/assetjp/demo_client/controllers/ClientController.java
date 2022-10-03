package com.assetjp.demo_client.controllers;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demoClient")
public class ClientController {

  @Autowired private EurekaClient eurekaClient;
  @Autowired private RestTemplateBuilder templateBuilder;

  @GetMapping()
  public String callService() {
//    InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("demo-service", false);
//    String url = instanceInfo.getHomePageUrl();
//
//    RestTemplate restTemplate = templateBuilder.build();
//    ResponseEntity<String> response =
//        restTemplate.exchange(url, HttpMethod.GET, null, String.class);
//    String res = "Client " + response.getBody();
    return "Client Service";
  }
}
