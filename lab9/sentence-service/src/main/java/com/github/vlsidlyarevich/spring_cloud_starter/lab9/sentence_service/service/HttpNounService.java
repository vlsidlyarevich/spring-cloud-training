package com.github.vlsidlyarevich.spring_cloud_starter.lab9.sentence_service.service;

import com.github.vlsidlyarevich.spring_cloud_starter.lab8.sentence_service.client.NounClient;
import com.github.vlsidlyarevich.spring_cloud_starter.lab8.sentence_service.model.WordResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HttpNounService extends HttpWordService implements NounService {

    private final NounClient nounClient;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public WordResponse getNoun() {
        return nounClient.getNoun();
    }
}
