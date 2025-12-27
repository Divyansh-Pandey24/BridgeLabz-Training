package com.constructors.levelone;

public class Books {
    public String ISBN;
    protected String title;
    private String author;

    Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

