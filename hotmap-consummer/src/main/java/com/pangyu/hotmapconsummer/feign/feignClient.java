package com.pangyu.hotmapconsummer.feign;

import com.pangyu.hotmapconsummer.entity.vo.location;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "hotMap")
public interface feignClient {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    List<location> findLocation();
}
