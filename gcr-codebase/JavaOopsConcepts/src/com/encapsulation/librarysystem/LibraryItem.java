package com.encapsulation.librarysystem;

public abstract class LibraryItem {

    private String itemId;
    private String title;
    private String author;

    // Constructor to initialize library item
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter methods for encapsulation
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    // Method to return item details
    public String getItemDetails() {
        return itemId + " - " + title + " by " + author;
    }
}
