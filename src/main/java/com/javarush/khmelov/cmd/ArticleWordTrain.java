package com.javarush.khmelov.cmd;

import com.javarush.khmelov.entity.ArticleWord;
import com.javarush.khmelov.service.ArticleWordService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Optional;

public class ArticleWordTrain implements Command {

    private final ArticleWordService articleWordService;

    public ArticleWordTrain(ArticleWordService articleWordService) {
        this.articleWordService = articleWordService;
    }

    @Override
    public String doGet(HttpServletRequest req, HttpServletResponse resp) {

        String word = req.getParameter("id");
        if (word != null) {
            Optional<ArticleWord> articleWord = articleWordService.get(word);
            if (articleWord.isPresent()) {
                ArticleWord objectArticleWord = articleWord.get();
                req.setAttribute("word", objectArticleWord);
            }
        }
        return getJspPage();
    }
}
