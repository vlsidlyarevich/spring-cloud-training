package com.github.vlsidlyarevich.spring_cloud_starter.lab8.sentence_service.service;

import com.github.vlsidlyarevich.spring_cloud_starter.lab8.sentence_service.client.VerbClient;
import com.github.vlsidlyarevich.spring_cloud_starter.lab8.sentence_service.model.WordResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HttpVerbService extends HttpWordService implements VerbService {

    private final VerbClient verbClient;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public WordResponse getVerb() {
        return verbClient.getVerb();
    }
}
