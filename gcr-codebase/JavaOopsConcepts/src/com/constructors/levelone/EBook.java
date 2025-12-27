package com.constructors.levelone;

public class EBook extends Books {

    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
    }

    public static void main(String[] args) {
        EBook e = new EBook("978-12345", "Core Java", "John Doe", 3.5);
        e.display();
    }
}

