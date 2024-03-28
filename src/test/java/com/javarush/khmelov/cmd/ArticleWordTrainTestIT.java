package com.javarush.khmelov.cmd;

import com.javarush.khmelov.config.Winter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

class ArticleWordTrainTestIT extends BaseIT {

    private final ArticleWordTrain articleWordTrain = Winter.find(ArticleWordTrain.class);

    @Test
    void whenGetWord_thenWord() {
        when(request.getParameter("id")).thenReturn("Pfanne");
        String jsp = articleWordTrain.doGet(request, response);
        Assertions.assertEquals("WEB-INF/article-word-train.jsp", jsp);
    }
}