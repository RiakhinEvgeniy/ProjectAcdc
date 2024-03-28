package com.javarush.khmelov.cmd;

import com.javarush.khmelov.config.Winter;
import com.javarush.khmelov.entity.ArticleWord;
import com.javarush.khmelov.repository.ArticleWordRepository;
import com.javarush.khmelov.service.ArticleWordService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.mock;

class ListWordIT extends BaseIT {

    private final ListWord listWord = Winter.find(ListWord.class);
    private final ArticleWordService articleWordService = Winter.find(ArticleWordService.class);
    @Test
    void whenGetCollection_thenResultJsp() {
        Collection<ArticleWord> collection = List.of(new ArticleWord("der", "Man"));
        ArticleWordRepository mockRepo = mock(ArticleWordRepository.class);
        Mockito.doReturn(collection).when(mockRepo).getAll();
        articleWordService.getAll();
        String jsp = listWord.doGet(request, response);
        Assertions.assertEquals("WEB-INF/list-word.jsp", jsp);
    }
}