package com.example.android.booklisting;

/**
 * Created by sonal on 23-03-2017.
 */

public class BooksInfo {
    private String title;
    private String author;
    BooksInfo(String x, String y){
        title = x;
        author = y;
    }

    String getTitle(){return title;}
    String getAuthor(){return author;}
}
