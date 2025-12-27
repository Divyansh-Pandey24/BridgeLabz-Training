package com.constructors.levelone;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "The lord of the rings";
        author = "R.R tolkien";
        price = 1499;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " by " + author + " | Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Guide", "James Gosling", 499.99);

        b1.display();
        b2.display();
    }
}

