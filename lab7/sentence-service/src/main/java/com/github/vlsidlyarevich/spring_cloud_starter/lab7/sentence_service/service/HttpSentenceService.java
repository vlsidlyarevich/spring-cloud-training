package com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.service;

import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.client.AdjectiveClient;
import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.client.ArticleClient;
import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.client.NounClient;
import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.client.SubjectClient;
import com.github.vlsidlyarevich.spring_cloud_starter.lab7.sentence_service.client.VerbClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HttpSentenceService implements SentenceService {

    private final SubjectClient subjectClient;
    private final VerbClient verbClient;
    private final ArticleClient articleClient;
    private final AdjectiveClient adjectiveClient;
    private final NounClient nounClient;

    @Override
    public String getSentence() {
        return String.format("%s %s %s %s %s.",
                subjectClient.getSubject().getValue(),
                verbClient.getVerb().getValue(),
                articleClient.getArticle().getValue(),
                adjectiveClient.getAdjective().getValue(),
                nounClient.getNoun().getValue());
    }
}
