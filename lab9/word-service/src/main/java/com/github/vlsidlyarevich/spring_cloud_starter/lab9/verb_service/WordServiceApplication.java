package com.github.vlsidlyarevich.spring_cloud_starter.lab8.verb_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WordServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordServiceApplication.class, args);
    }
}
