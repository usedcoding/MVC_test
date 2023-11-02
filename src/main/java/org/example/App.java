package org.example;

import org.example.article.ArticleController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {
        Scanner sc = new Scanner(System.in);


        ArticleController articleController = new ArticleController(sc);

        while(true) {
            System.out.print("명령어 ) ");
            String command = sc.nextLine();

            if(command.equals("종료")) {
                System.out.println("==시스템 종료==");
                break;
            } else if(command.equals("등록")) {
                articleController.create();

            }else if(command.equals("목록")) {
                articleController.list();

            }else if(command.equals("삭제")) {
                articleController.remove();

            }else if(command.equals("수정")) {
                articleController.modify();

            }
        }
    }
}


