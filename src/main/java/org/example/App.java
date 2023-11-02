package org.example;

import org.example.article.Article;
import org.example.article.ArticleController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);

    ArticleController articleController = new ArticleController(sc);
    public void run () {
        System.out.println("== 시스템 시작 ==");

        while(true) {
            System.out.print("명령어 ) ");
            String command = sc.nextLine();
            switch (command) {
                case "종료" :
                    System.out.println("== 시스템 종료 ==");
                    return;
                case "등록" :
                    articleController.create();
                    break;
                case "목록" :
                    articleController.list();
                    break;
                case "삭제" :
                    articleController.remove();
                    break;
                case "수정" :
                    articleController.modify();
                    break;
            }

        }

    }


}

