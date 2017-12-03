package com.github.vlsidlyarevich.spring_cloud_starter.lab3.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStarterApplication.class, args);
    }
}
