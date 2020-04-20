package com.pangyu.productconsummer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class helloController {
    @Autowired
    RestTemplate restTemplate;
    
    
    @RequestMapping("/hello/1")
    public String hello(){

        String forObject = restTemplate.getForObject("https://localhost:8777", String.class);

        // ResponseEntity<String> forEntity = restTemplate.getForEntity("localhost:8777", String.class);

        return  forObject;
    }
    
    
    
    
    
    
}
