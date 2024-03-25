package com.javarush.khmelov.cmd;

import com.javarush.khmelov.entity.ArticleWord;
import com.javarush.khmelov.service.ArticleWordService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

public class CheckArticle implements Command {

    private final ArticleWordService articleWordService;

    public CheckArticle(ArticleWordService articleWordService) {
        this.articleWordService = articleWordService;
    }

    @Override
    public String doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String wordId = req.getParameter("id");
        String articleFromReq = req.getParameter("article");
        if (wordId != null) {
            Optional<ArticleWord> articleFromButton = articleWordService.get(wordId);
            if (articleFromButton.isPresent()) {
                String article = articleFromButton.get().getArticle();
                String word = articleFromButton.get().getWord();
                if (articleFromReq.equals(article)) {
                    req.setAttribute("article", article);
                    req.setAttribute("word", word);
                } else {
                    RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/view.jsp");
                    dispatcher.forward(req, resp);
                }
            }
        }
        return getJspPage();
    }
}
