package com.javarush.khmelov.cmd;

import com.javarush.khmelov.config.Winter;
import jakarta.servlet.ServletException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class CheckArticleIT extends BaseIT {

    CheckArticle checkArticle = Winter.find(CheckArticle.class);
    @Test
    void whenInvokeDoGet_thenReturnJspPage() throws ServletException, IOException {
        String jsp = checkArticle.doGet(request, response);
        Assertions.assertEquals("WEB-INF/check-article.jsp", jsp);
    }
}