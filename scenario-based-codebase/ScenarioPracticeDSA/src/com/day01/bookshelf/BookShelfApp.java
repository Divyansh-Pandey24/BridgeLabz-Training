package com.day01.bookshelf;

import java.util.Scanner;

public class BookShelfApp {
	public static void main(String[] args) {
		BookShelf library = new BookShelf();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to BookShelf - Library Organizer!\n");

		while (true) {
			System.out.println("=== Menu ===");
			System.out.println("1. Add a book");
			System.out.println("2. Remove a book");
			System.out.println("3. Display books in a genre");
			System.out.println("4. Exit");
			System.out.print("Choose an option (1-4): ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter genre: ");
				String genre = scanner.nextLine();
				System.out.print("Enter book title: ");
				String title = scanner.nextLine();
				System.out.print("Enter author name: ");
				String author = scanner.nextLine();
				library.addBook(genre, title, author);
				break;

			case 2:
				System.out.print("Enter genre: ");
				genre = scanner.nextLine();
				System.out.print("Enter book title: ");
				title = scanner.nextLine();
				System.out.print("Enter author name: ");
				author = scanner.nextLine();
				library.removeBook(genre, title, author);
				break;

			case 3:
				System.out.print("Enter genre to display: ");
				genre = scanner.nextLine();
				library.displayGenre(genre);
				break;

			case 4:
				System.out.println("Thank you for using BookShelf! Goodbye!");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
			System.out.println();
		}
	}

}