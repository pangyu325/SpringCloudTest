package com.pangyu.productconsummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductConsummerApplication {


    //注入一个RestTemplate 对象到容器种
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }





    public static void main(String[] args) {
        SpringApplication.run(ProductConsummerApplication.class, args);
    }

}
