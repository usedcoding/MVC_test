package org.example.article;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    long id = 0;
    List<Article> articleList = new ArrayList<>();
    public long create(String title, String content) {
        id++;
        Article article = new Article(id, title, content);
        articleList.add(article);
        return id;
    }

    public List<Article> getArticleListAll() {
        return articleList;
    }

    public void remove(Article article) {
        articleList.remove(article);
    }

    public void modify(Article article, String title, String content) {
        article.setTitle(title);
        article.setContent(content);
    }

    public Article articleListFindById(long id) {
        for(int i = 0; i < articleList.size(); i++) {
            Article article = articleList.get(i);
            if(article.getId() == id){
                return article;
            }
        }
        return null;
    }
}
