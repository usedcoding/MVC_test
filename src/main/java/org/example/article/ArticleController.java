package org.example.article;

import org.example.Container;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticleController {


    ArticleService articleService = new ArticleService();



    public void create() {

        System.out.print("제목 ) ");
        String title = Container.getScanner().nextLine();

        System.out.print("내용 ) ");
        String content = Container.getScanner().nextLine();
       long id = this.articleService.create(title, content);

        System.out.println(id + "번 게시물이 등록 되었습니다.");
    }

    public void list() {
        List<Article> articleList = this.articleService.getArticleListAll();
        System.out.println("번호 / 제목 / 내용");
        for(int i = 0; i < articleList.size(); i++) {
            Article article = articleList.get(i);
            System.out.printf("%d / %s / %s \n", article.getId(), article.getTitle(), article.getContent());
        }
    }

    public void remove() {

        System.out.print("삭제할 번호 ) ");
        long id = Container.getScanner().nextLong();
        Container.getScanner().nextLine();

        Article article = this.articleService.articleListFindById(id);
        this.articleService.remove(article);

        System.out.println(id + "번 게시글이 삭제 되었습니다.");
    }

    public void modify() {

        System.out.print("수정할 번호 )");
        long id = Container.getScanner().nextLong();
        Container.getScanner().nextLine();

        Article article = this.articleService.articleListFindById(id);

        if(article.getId() == id) {
            System.out.println("기존 제목 :" + article.getTitle());
            System.out.print("수정 ) ");
            String title = Container.getScanner().nextLine();


            System.out.println("기존 내용 :" + article.getContent());
            System.out.print("수정 ) ");
            String content = Container.getScanner().nextLine();

            this.articleService.modify(article, title, content);
            System.out.println(id + "번 게시글이 수정 되었습니다.");
        }

    }

}
