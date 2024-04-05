package com.javarush.khmelov.service;

import com.javarush.khmelov.entity.ArticleWord;
import com.javarush.khmelov.repository.ArticleWordRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

@SuppressWarnings("unused")
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

    public void delete(ArticleWord word) {
        articleWordRepository.delete(word);
    }

    public void checkingCorrectAnswer(String wordFromReq, String articleFromReq, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (wordFromReq != null) {
            Optional<ArticleWord> objectArticleWord = get(wordFromReq);
            if (objectArticleWord.isPresent()) {
                String word = objectArticleWord.get().getWord();
                String article = objectArticleWord.get().getArticle();
                if (article.equalsIgnoreCase(articleFromReq)) {
                    req.setAttribute("word", word);
                    req.setAttribute("article", article);
                    //delete(objectArticleWord.get());
                } else {
                    RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/view.jsp");
                    dispatcher.forward(req, resp);
                }
            }
        }
    }
}
