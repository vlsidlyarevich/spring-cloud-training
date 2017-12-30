package com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("article-service")
public interface ArticleClient {

    @GetMapping("/")
    String getArticle();
}
