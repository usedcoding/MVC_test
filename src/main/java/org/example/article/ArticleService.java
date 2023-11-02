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

    public List<Article> getArticleListAll() {
        return articleList;
    }

    public Article remove(long id) {
        return this.articleFindById(id);
    }
    private Article articleFindById(long id) {
        for(int i = 0; i < articleList.size(); i++) {
            Article article = articleList.get(i);
            if(article.getId() == id) {
                return article;
            }
        }
        return null;
    }

}
