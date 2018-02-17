package com.github.vlsidlyarevich.spring_cloud_starter.lab9.sentence_service.controller;

import com.github.vlsidlyarevich.spring_cloud_starter.lab9.sentence_service.service.SentenceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SentenceController {

    private final SentenceService sentenceService;

    @GetMapping("/sentence")
    public ResponseEntity getSentence() {
        return ResponseEntity.ok().body(sentenceService.getSentence());
    }
}
