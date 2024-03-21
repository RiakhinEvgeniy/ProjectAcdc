package com.javarush.khmelov.cmd;

import com.javarush.khmelov.entity.ArticleWord;
import com.javarush.khmelov.service.ArticleWordService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Collection;

public class ArticleWordTrain implements Command {

    private final ArticleWordService articleWordService;

    public ArticleWordTrain(ArticleWordService articleWordService) {
        this.articleWordService = articleWordService;
    }

    @Override
    public String doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Collection<ArticleWord> allArticleWords = articleWordService.getAll();
        req.setAttribute("articleWords", allArticleWords);
        return getJspPage();
    }
}
