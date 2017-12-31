package com.github.vlsidlyarevich.spring_cloud_starter.lab7.verb_service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class WordResponse implements Serializable {

    @JsonProperty("word")
    private String value;
}
