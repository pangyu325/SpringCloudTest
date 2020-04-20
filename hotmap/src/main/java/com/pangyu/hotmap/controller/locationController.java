package com.pangyu.hotmap.controller;

import com.pangyu.hotmap.entity.po.location;
import com.pangyu.hotmap.service.locationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;
@RestController
public class locationController {
    @Resource
    locationService locationService1;

    @RequestMapping("/test")
    public List<location> test(){


        return locationService1.select();
    }




}
