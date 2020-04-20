package com.pangyu.feignclient.controller;


import com.pangyu.feignclient.feign.feignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @Autowired
    feignClient feign;

    @RequestMapping("/hello3")
    public String hello3(){


        return feign.hello();

    }



}
