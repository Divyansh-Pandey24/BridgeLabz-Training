package com.day05.bookbazar;
public class Order {

    private String customerName;
    private double totalAmount = 0;
    private String status = "CREATED";

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void addBook(Book book, int qty) {

        if (book.reduceStock(qty)) {

            double discountedPrice = book.applyDiscount(book.getPrice());

            totalAmount += discountedPrice * qty;

            System.out.println(qty + " x " + book.getTitle() + " added to order.");
        } else {
            System.out.println("Not enough stock!");
        }
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public void confirmOrder() {
        setStatus("CONFIRMED");
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }
}
