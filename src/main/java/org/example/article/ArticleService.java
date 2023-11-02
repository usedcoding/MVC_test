package org.example.article;


import java.util.List;

public class ArticleService {
    ArticleRepository articleRepository = new ArticleRepository();
    public long create( String title, String content) {
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

    public Article articleListFindById(long id) {
       return this.articleRepository.articleListFindById(id);
    }


}
