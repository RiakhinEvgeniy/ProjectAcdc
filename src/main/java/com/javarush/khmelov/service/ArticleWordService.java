package com.javarush.khmelov.service;

import com.javarush.khmelov.entity.ArticleWord;
import com.javarush.khmelov.repository.ArticleWordRepository;

import java.util.Collection;
import java.util.Optional;

public class ArticleWordService {
    private final ArticleWordRepository articleWordRepository;

    public ArticleWordService(ArticleWordRepository articleWordRepository) {
        this.articleWordRepository = articleWordRepository;
    }

    public Collection<ArticleWord> getAll() {
        return articleWordRepository.getAll();
    }

    public Optional<ArticleWord> get(String word) {
        return articleWordRepository.get(word);
    }

}
