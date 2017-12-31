package com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.client;

import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.model.WordResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("adjective-service")
public interface AdjectiveClient extends WordClient {

    @GetMapping("/")
    @HystrixCommand(fallbackMethod = "fallback")
    WordResponse getAdjective();
}
