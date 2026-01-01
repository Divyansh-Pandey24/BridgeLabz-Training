package com.encapsulation.librarysystem;

public class Magazine extends LibraryItem implements Reservable {

    private boolean isAvailable;

    // Constructor to initialize magazine
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    // Loan duration for magazines
    @Override
    public int getLoanDuration() {
        return 7;
    }

    // Reserve magazine
    @Override
    public void reserveItem() {
        isAvailable = false;
    }

    // Check magazine availability
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

