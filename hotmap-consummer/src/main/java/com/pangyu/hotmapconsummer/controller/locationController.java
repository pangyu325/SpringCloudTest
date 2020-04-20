package com.pangyu.hotmapconsummer.controller;

import com.pangyu.hotmapconsummer.entity.vo.location;
import com.pangyu.hotmapconsummer.feign.feignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class locationController {

    @Autowired
    feignClient feign;

    @RequestMapping(value = "/helloLocation",method = RequestMethod.GET)
    public List<location> helloLocation(){
        List<location> location = feign.findLocation();

        return location;
    }

}
