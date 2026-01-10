package com.day01.bookshelf;

import java.util.Objects;

public class Book {

	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Book)) return false;
		Book book = (Book) o;
		return title.equalsIgnoreCase(book.title) && author.equalsIgnoreCase(book.author);
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(title.toLowerCase(), author.toLowerCase());
	}
	
	@Override
	public String toString() {
		return title + author;
	}
}
