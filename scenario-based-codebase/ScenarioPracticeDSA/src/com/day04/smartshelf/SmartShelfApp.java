package com.day04.smartshelf;
public class SmartShelfApp {
    public static void main(String[] args) {

        Book[] shelf = new Book[10];   
        int size = 0;

        // User adds books one by one
        shelf[size++] = new Book("Java Programming", "James");
        SmartShelf.sortBooks(shelf, size);

        shelf[size++] = new Book("Algorithms", "CLRS");
        SmartShelf.sortBooks(shelf, size);

        shelf[size++] = new Book("Data Structures", "Seymour");
        SmartShelf.sortBooks(shelf, size);

        shelf[size++] = new Book("Artificial Intelligence", "Russell");
        SmartShelf.sortBooks(shelf, size);

        System.out.println("Books on SmartShelf (Sorted Alphabetically):");
        SmartShelf.display(shelf, size);
    }
}
