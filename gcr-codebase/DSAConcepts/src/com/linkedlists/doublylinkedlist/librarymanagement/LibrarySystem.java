package com.linkedlists.doublylinkedlist.librarymanagement;

public class LibrarySystem {

    public static void main(String[] args) {

        LibraryLinkedList library = new LibraryLinkedList();

        library.addBookAtFirst("The Alchemist", "Paulo Coelho", "Fiction", 101, true);
        library.addBookAtLast("Atomic Habits", "James Clear", "Self-help", 102, true);
        library.addBookAtIndex("Clean Code", "Robert Martin", "Programming", 103, false, 1);

        System.out.println("\nBooks (Forward Order):");
        library.displayForward();

        System.out.println("\nBooks (Reverse Order):");
        library.displayReverse();

        library.updateAvailability(102, false);

        library.removeBook(101);

        System.out.println("\nAfter Updates:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}
