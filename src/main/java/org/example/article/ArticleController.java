package org.example.article;

import org.example.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticleController {

    long id = 0;
    Scanner sc;

    public ArticleController(Scanner sc) {
        this.sc = sc;
    }

    ArticleService articleService = new ArticleService();

    public void create() {
        id++;
        System.out.print("제목 ) ");
        String title = sc.nextLine();

        System.out.print("내용 ) ");
        String content = sc.nextLine();

        this.articleService.create(id, title, content);

        System.out.println(id + "번 게시물이 등록 되었습니다.");
    }

    public void list() {
         List<Article> articleList = articleService.getArticleListAll();
        System.out.println("번호 / 제목 / 내용 ");
        for (int i = 0; i < articleList.size(); i++) {
            Article article = articleList.get(i);
            System.out.printf("%d / %s / %s \n", article.getId(), article.getTitle(), article.getContent());
        }
    }

    public void remove() {
        System.out.print("삭제할 번호 ) ");
        id = sc.nextLong();
        sc.nextLine();

        Article article = this.articleService.remove(id);

            if (article.getId() == id) {
                articleList.remove(article);
            }


        System.out.println(id + "번 게시물이 삭제 되었습니다.");
    }

    public void modify() {
        System.out.print("수정할 번호 ) ");
        id = sc.nextLong();
        sc.nextLine();

        Article article = this.articleFindById(id);
        if (article.getId() == id) {
            System.out.println("기존 제목 : " + article.getTitle());
            System.out.println("수정 제목 )");
            String title = sc.nextLine();
            article.setTitle(title);

            System.out.println("기존 내용 : " + article.getContent());
            System.out.println("수정 내용 )");
            String content = sc.nextLine();
            article.setContent(content);

            System.out.println(id + "번 게시물이 수정 되었습니다.");
        }

    }


}


