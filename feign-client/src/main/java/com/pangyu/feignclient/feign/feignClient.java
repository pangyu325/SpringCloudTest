package com.pangyu.feignclient.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-product")
public interface feignClient {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();
}
