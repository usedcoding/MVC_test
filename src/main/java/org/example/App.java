package org.example;

import org.example.article.Article;
import org.example.article.ArticleController;
import org.example.db.DBConnection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    ArticleController articleController = new ArticleController();
    public App() {
        DBConnection.DB_NAME = "proj1";
        DBConnection.DB_USER = "root";
        DBConnection.DB_PASSWORD = "";
        DBConnection.DB_PORT = 3306;

        Container.getDBconnection().connect();
    }
    public void run () {
        System.out.println("== 시스템 시작 ==");

        while(true) {
            System.out.print("명령어 ) ");
            String command = Container.getScanner().nextLine();
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

