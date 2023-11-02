package org.example.article;

import org.example.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {
    List<Article> articleList = new ArrayList<>();

    public  void create(long id, String title, String content) {
        Article article = new Article(id, title, content);
        articleList.add(article);
    }

    public List<Article> getArticleListAll(Article article) {
        return articleList;
    }
}
