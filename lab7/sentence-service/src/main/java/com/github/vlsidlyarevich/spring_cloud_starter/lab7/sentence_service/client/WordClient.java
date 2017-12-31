package com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.client;

import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.model.WordResponse;

public interface WordClient {

    default WordResponse fallback() {
        return new WordResponse("");
    }
}
