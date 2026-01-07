package com.day05.bookbazar;
import java.util.Scanner;

public class BookStoreApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to BookBazaar ===");

        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();

        System.out.println("\nChoose Book Type:");
        System.out.println("1. E-Book (10% off)");
        System.out.println("2. Printed Book (5% off)");
        System.out.print("Enter choice: ");
        int type = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock Available: ");
        int stock = sc.nextInt();

        System.out.print("Enter Quantity to Order: ");
        int qty = sc.nextInt();

        Book book;

        if (type == 1) {
            book = new EBook(title, author, price, stock);
        } else {
            book = new PrintedBook(title, author, price, stock);
        }

        Order order = new Order(customer);

        order.addBook(book, qty);

        order.confirmOrder();

        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("Customer: " + customer);
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Total Payable Amount: " + order.getTotalAmount());

        sc.close();
    }
}
