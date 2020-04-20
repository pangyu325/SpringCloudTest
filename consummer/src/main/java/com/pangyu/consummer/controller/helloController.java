package com.pangyu.consummer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class helloController {
    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/hello2")
    public String hello(){
        String forObject = restTemplate.getForObject("http://localhost:8777/hello", String.class);


        return "hello2"+forObject;

    }



}
