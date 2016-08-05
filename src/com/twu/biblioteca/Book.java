package com.twu.biblioteca;

public class Book {

    private String title;

    private String author;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.author = author;
    }

    public String getTitle() {
            return title;
    }

    public String getAuthor() {
        return author;
    }
}
