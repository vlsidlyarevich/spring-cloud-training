package com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.service;

import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.client.AdjectiveClient;
import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.model.WordResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HttpAdjectiveService extends HttpWordService implements AdjectiveService {

    private final AdjectiveClient adjectiveClient;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public WordResponse getAdjective() {
        return adjectiveClient.getAdjective();
    }
}
