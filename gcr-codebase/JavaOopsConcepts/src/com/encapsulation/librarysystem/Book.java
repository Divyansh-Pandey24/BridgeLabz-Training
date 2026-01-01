package com.encapsulation.librarysystem;

public class Book extends LibraryItem implements Reservable {

    private boolean isAvailable;

    // Constructor to initialize book
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    // Loan duration for books
    @Override
    public int getLoanDuration() {
        return 14;
    }

    // Reserve book
    @Override
    public void reserveItem() {
        isAvailable = false;
    }

    // Check book availability
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

