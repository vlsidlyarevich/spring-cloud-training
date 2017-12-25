package com.github.vlsidlyarevich.spring_cloud_starter.lab6.sentence_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SentenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentenceServiceApplication.class, args);
    }
}
