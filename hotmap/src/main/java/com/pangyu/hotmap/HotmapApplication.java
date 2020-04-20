package com.pangyu.hotmap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan("com.pangyu.hotmap.mapper")
@SpringBootApplication
public class HotmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotmapApplication.class, args);
    }

}
