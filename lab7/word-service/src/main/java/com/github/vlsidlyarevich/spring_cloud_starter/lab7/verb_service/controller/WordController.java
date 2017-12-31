package com.github.vlsidlyarevich.spring_cloud_starter.lab7.verb_service.controller;

import com.github.vlsidlyarevich.spring_cloud_starter.lab7.verb_service.model.WordResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    private final String WORD_SEPARATOR = ",";

    @Value("${words}")
    private String words;

    @GetMapping("/")
    public ResponseEntity getWord() {
        final String[] wordArray = words.split(WORD_SEPARATOR);

        int i = (int) Math.round(Math.random() * (wordArray.length - 1));

        return ResponseEntity.ok().body(new WordResponse(wordArray[i]));
    }
}
