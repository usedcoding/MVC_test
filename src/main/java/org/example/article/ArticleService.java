package org.example.article;

import org.example.Article;


import java.util.ArrayList;
import java.util.List;

public class ArticleService {

    ArticleRepository articleRepository = new ArticleRepository();

    public  long  create( String title, String content) {
        return this.articleRepository.create(title, content);

    }

    public List<Article> getArticleListAll() {
        return this.articleRepository.getArticleListAll();
    }

    public void remove(Article article) {
        this.articleRepository.remove(article);
    }

    public void modify(Article article, String title, String content) {
        this.articleRepository.modify(article, title, content);
    }
    public Article articleFindById(long id) {
        return articleRepository.articleFindById(id);
    }


}
