package com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.service;

import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.model.WordResponse;

public abstract class HttpWordService {

    protected WordResponse fallback() {
        return new WordResponse("");
    }
}
