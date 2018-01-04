package com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HttpSentenceService implements SentenceService {

    private final SubjectService subjectService;
    private final VerbService verbService;
    private final ArticleService articleService;
    private final AdjectiveService adjectiveService;
    private final NounService nounService;

    @Override
    public String getSentence() {
        return String.format("%s %s %s %s %s.",
                subjectService.getSubject().getValue(),
                verbService.getVerb().getValue(),
                articleService.getArticle().getValue(),
                adjectiveService.getAdjective().getValue(),
                nounService.getNoun().getValue());
    }
}
