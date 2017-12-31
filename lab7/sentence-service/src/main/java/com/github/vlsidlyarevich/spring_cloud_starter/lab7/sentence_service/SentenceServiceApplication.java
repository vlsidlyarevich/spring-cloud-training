package com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class SentenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentenceServiceApplication.class, args);
    }
}
