package com.javarush.khmelov.repository;

import com.javarush.khmelov.entity.ArticleWord;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ArticleWordRepository implements RepositoryArticleWord<ArticleWord> {

    private final Map<String, ArticleWord> articleWordMap = new HashMap<>();

    public ArticleWordRepository() {
        articleWordMap.put("Pfanne", new ArticleWord("die", "Pfanne"));
        articleWordMap.put("Messer", new ArticleWord("das", "Messer"));
        articleWordMap.put("Teller", new ArticleWord("der", "Teller"));
        articleWordMap.put("Gabel", new ArticleWord("die", "Gabel"));
    }

    @Override
    public Collection<ArticleWord> getAll() {
        return articleWordMap.values();
    }

    @Override
    public Optional<ArticleWord> get(String article) {
        return Optional.ofNullable(articleWordMap.get(article));
    }

    @Override
    public void create(ArticleWord entity) {
        articleWordMap.put(entity.getWord(), entity);
    }

    @Override
    public void update(ArticleWord entity) {

    }

    @Override
    public void delete(ArticleWord entity) {
        articleWordMap.remove(entity.getWord());
    }
}