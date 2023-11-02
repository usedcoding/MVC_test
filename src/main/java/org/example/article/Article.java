package org.example.article;

import lombok.AllArgsConstructor;

import lombok.Setter;

@Setter
@AllArgsConstructor
public class Article {
    private long id;
    private String title;
    private String content;

    public long getId() {
       return this.id = id;
    }

    public String getTitle() {
        return this.title = title;
    }

    public String getContent() {
        return this.content = content;
    }
}
