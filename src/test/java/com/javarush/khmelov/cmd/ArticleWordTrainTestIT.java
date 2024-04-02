package com.javarush.khmelov.cmd;

import com.javarush.khmelov.config.Winter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ArticleWordTrainTestIT extends BaseIT {

    private final ArticleWordTrain articleWordTrain = Winter.find(ArticleWordTrain.class);

    @Test
    void whenInvokeDoGet_thenReturnJspPage() {
        String jsp = articleWordTrain.doGet(request, response);
        Assertions.assertEquals("WEB-INF/article-word-train.jsp", jsp);
    }
}