package com.javarush.khmelov.service;

import com.javarush.khmelov.cmd.BaseIT;
import com.javarush.khmelov.config.Winter;
import com.javarush.khmelov.entity.ArticleWord;
import com.javarush.khmelov.repository.ArticleWordRepository;
import com.javarush.khmelov.repository.RepositoryArticleWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

class ArticleWordServiceIT {

    //private final ArticleWordService articleWordService = Winter.find(ArticleWordService.class);
    @Test
    void getAll() {
        ArticleWordRepository repo = Mockito.mock(ArticleWordRepository.class);
        Collection<ArticleWord> stubForCollection = List.of(new ArticleWord(), new ArticleWord());
        int size = stubForCollection.size();
        Mockito.doReturn(stubForCollection).when(repo).getAll();
        Collection<ArticleWord> articleWords = repo.getAll();
        Assertions.assertEquals(size, articleWords.size());
        Mockito.verify(repo, Mockito.atLeast(1)).getAll();
    }

    @Test
    void get() {
        ArticleWordRepository repo = Mockito.mock(ArticleWordRepository.class);
        Optional<ArticleWord> optionalArticleWord = Optional.of(new ArticleWord("die", "Pfanne"));
        String article = optionalArticleWord.get().getArticle();

        Mockito.doReturn(optionalArticleWord).when(repo).get("Pfanne");

        ArticleWordService articleWordService = new ArticleWordService(repo);
        Optional<ArticleWord> articleWord = articleWordService.get("Pfanne");

        String articleFromService = null;
        if (articleWord.isPresent()) {
            articleFromService = articleWord.get().getArticle();
        }

        Assertions.assertEquals(articleFromService, article);
        Mockito.verify(repo, Mockito.atLeast(1)).get("Pfanne");
    }

    @Test
    void delete() {
    }

    @Test
    void checkingCorrectAnswer() {

    }
}