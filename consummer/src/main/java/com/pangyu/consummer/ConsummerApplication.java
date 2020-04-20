package com.pangyu.consummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@EnableDiscoveryClient
@SpringBootApplication
public class ConsummerApplication {


    //客户端负载均衡，使用客户端负载均衡就需要用微服务名来代替主机名

   // @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsummerApplication.class, args);
    }

}
