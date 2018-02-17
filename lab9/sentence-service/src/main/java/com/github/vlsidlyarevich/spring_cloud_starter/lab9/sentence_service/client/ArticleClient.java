package com.github.vlsidlyarevich.spring_cloud_starter.lab9.sentence_service.client;

import com.github.vlsidlyarevich.spring_cloud_starter.lab9.sentence_service.model.WordResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("article-service")
public interface ArticleClient {

    @GetMapping("/")
    WordResponse getArticle();
}
