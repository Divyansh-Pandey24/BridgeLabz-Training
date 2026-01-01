package com.encapsulation.librarysystem;

public class LibrarySystem {

    // Method to process library item
    public static void processItem(LibraryItem item) {

        System.out.println(item.getItemDetails());
        System.out.println("Loan Duration : " + item.getLoanDuration() + " days");
        System.out.println();
    }

    // Main method to test polymorphism
    public static void main(String[] args) {

        LibraryItem i1 = new Book("B101", "Mathematics", "James");
        LibraryItem i2 = new Magazine("M201", "Champak", "Editor");
        LibraryItem i3 = new DVD("D301", "Inception", "Nolan");

        processItem(i1);
        processItem(i2);
        processItem(i3);
    }
}

