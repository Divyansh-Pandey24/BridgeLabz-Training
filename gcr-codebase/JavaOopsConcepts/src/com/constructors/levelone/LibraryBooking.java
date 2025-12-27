package com.constructors.levelone;

public class LibraryBooking {
    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized constructor
    LibraryBooking(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }
    
    // Method to check whether the book is available or not
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully: " + title);
        } else {
            System.out.println("Sorry! Book is not available.");
        }
    }

    public static void main(String[] args) {
    	LibraryBooking b = new LibraryBooking("Social Science", "Herbert Schildt", 350);

        b.borrowBook();
        b.borrowBook();  // second attempt
    }
}

