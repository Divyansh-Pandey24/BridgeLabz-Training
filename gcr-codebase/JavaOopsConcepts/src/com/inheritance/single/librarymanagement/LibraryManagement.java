package com.inheritance.single.librarymanagement;

public class LibraryManagement {

    public static void main(String[] args) {

        // Demonstration of single inheritance
    	
        Book book = new Author(
                "HC Verma Chemistry",
                2000,
                "HC Verma",
                "Expert in chemistry best practices"
        );

        book.displayInfo();
    }
}
