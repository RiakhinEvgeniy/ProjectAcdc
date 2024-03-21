package com.javarush.khmelov.repository;

import com.javarush.khmelov.entity.ArticleWord;

import java.util.Collection;
import java.util.Optional;

public interface RepositoryArticleWord<T> {

    Collection<ArticleWord> getAll();
    Optional<T> get(String article);
    void create(T entity);
    void update(T entity);
    void delete(T entity);
}
