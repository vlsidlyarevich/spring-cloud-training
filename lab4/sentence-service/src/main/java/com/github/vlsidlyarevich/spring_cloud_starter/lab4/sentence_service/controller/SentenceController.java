package com.github.vlsidlyarevich.spring_cloud_starter.lab4.sentence_service.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor = @Autowired)
public class SentenceController {

    private final DiscoveryClient discoveryClient;

    @GetMapping("/")
    public ResponseEntity getSentence() {

    }
}
