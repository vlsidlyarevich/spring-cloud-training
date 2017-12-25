package com.github.vlsidlyarevich.spring_cloud_starter.lab6.sentence_service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("adjective-service")
public interface AdjectiveClient {

    @GetMapping("/")
    String getAdjective();
}
