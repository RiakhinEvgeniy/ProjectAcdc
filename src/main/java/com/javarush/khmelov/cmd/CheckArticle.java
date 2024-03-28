package com.javarush.khmelov.cmd;

import com.javarush.khmelov.service.ArticleWordService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CheckArticle implements Command {

    private final ArticleWordService articleWordService;

    public CheckArticle(ArticleWordService articleWordService) {
        this.articleWordService = articleWordService;
    }

    @Override
    public String doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String wordId = req.getParameter("id");
        String articleFromReq = req.getParameter("article");
        articleWordService.checkingCorrectAnswer(wordId, articleFromReq, req, resp);
        return getJspPage();
    }
}
