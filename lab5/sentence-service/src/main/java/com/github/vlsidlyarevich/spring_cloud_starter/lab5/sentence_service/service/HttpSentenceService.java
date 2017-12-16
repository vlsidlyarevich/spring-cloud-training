package com.github.vlsidlyarevich.spring_cloud_starter.lab5.sentence_service.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HttpSentenceService implements SentenceService {

    private final String SUBJECT_SERVICE = "subject-service";
    private final String VERB_SERVICE = "verb-service";
    private final String ARTICLE_SERVICE = "article-service";
    private final String ADJECTIVE_SERVICE = "adjective-service";
    private final String NOUN_SERVICE = "noun-service";

    private final DiscoveryClient discoveryClient;

    @Override
    public String getWord() {
        return getWord(SUBJECT_SERVICE) + " "
                + getWord(VERB_SERVICE) + " "
                + getWord(ARTICLE_SERVICE) + " "
                + getWord(ADJECTIVE_SERVICE) + " "
                + getWord(NOUN_SERVICE) + ".";
    }

    private String getWord(final String serviceName) {
        final List<ServiceInstance> list = discoveryClient.getInstances(serviceName);

        if (Objects.nonNull(list) && !list.isEmpty()) {
            final URI uri = list.get(0).getUri();

            if (Objects.nonNull(uri)) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }

        return null;
    }
}
