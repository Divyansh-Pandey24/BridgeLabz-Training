package com.day01.bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BookShelf {

	HashMap<String, LinkedList<Book>> map;
	HashSet<Book> allBooks;
	
	public BookShelf() {
		this.map = new HashMap<>();
		this.allBooks = new HashSet<>();
	}
	
	public boolean addBook(String title, String author, String genre) {
		Book newBook = new Book(title, author);
		
		if(allBooks.contains(newBook)) {
			System.out.println("The book already exists");
			return false;
		}
		
		map.putIfAbsent(genre, new LinkedList<>());
		LinkedList<Book> books = map.get(genre);
		 
		books.addLast(newBook);
		allBooks.add(newBook);
		
		System.out.println("The author and title are :"+ newBook);
		return true;
	}
	
	public boolean removeBook(String title, String author, String genre) {
		
		if(! map.containsKey(genre)) {
			System.out.println("Genre '" + genre + "' not found.");
            return false;
		}
		
		LinkedList<Book> books = map.get(genre);
		Book target = new Book(title, author);
		
		if(books.remove(target)) {
			allBooks.remove(target);
			if (books.isEmpty()) {
                map.remove(genre);
                System.out.println("Genre '" + genre + "' is now empty and removed.");
            }

            System.out.println("Removed " + target + " from genre: " + genre);
            return true;
        } else {
            System.out.println("Book not found in genre: " + genre);
            return false;
        }
		}
	public void displayGenre(String genre) {
        if (!map.containsKey(genre)) {
            System.out.println("No books found in genre: " + genre);
            return;
        }

        System.out.println("\n=== Books in " + genre + " ===");
        LinkedList<Book> books = map.get(genre);
        for (Book book : books) {
            System.out.println("• " + book);
        }
        System.out.println("Total: " + books.size() + " books\n");
    }
	
	public void displayCatalogSummary() {
        System.out.println("\n=== Library Catalog Summary ===");
        for (String genre : map.keySet()) {
            int count = map.get(genre).size();
            System.out.println(genre + " (" + count + " books)");
        }
        System.out.println("Total unique books: " + allBooks.size() + "\n");
    }
}
