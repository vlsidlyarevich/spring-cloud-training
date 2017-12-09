package com.github.vlsidlyarevich.spring_cloud_starter.lab4.article_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    private final String WORD_SEPARATOR = ",";

    @Value("${words}")
    private String words;

    @GetMapping("/")
    public ResponseEntity getWord() {
        final String[] wordArray = words.split(WORD_SEPARATOR);

        int i = (int) Math.round(Math.random() * (wordArray.length - 1));

        return ResponseEntity.ok().body(wordArray[i]);
    }
}
