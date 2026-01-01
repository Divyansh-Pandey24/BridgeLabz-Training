package com.encapsulation.librarysystem;

public class DVD extends LibraryItem implements Reservable {

    private boolean isAvailable;

    // Constructor to initialize DVD
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    // Loan duration for DVDs
    @Override
    public int getLoanDuration() {
        return 3;
    }

    // Reserve DVD
    @Override
    public void reserveItem() {
        isAvailable = false;
    }

    // Check DVD availability
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

