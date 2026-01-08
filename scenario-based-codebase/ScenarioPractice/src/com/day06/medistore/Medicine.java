package com.day06.medistore;
import java.time.LocalDate;

public class Medicine implements ISellable {

    private String name;
    private double price;          
    private LocalDate expiryDate;
    private int quantity;

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    // Constructor with quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulated getters
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // Private pricing logic
    private double applyDiscount(double total) {
        return total - (total * 0.10); 
    }

    @Override
    public void sell(int qty) {
        if (qty > quantity) {
            System.out.println("Insufficient stock");
            return;
        }

        double total = price * qty;        
        total = applyDiscount(total);

        quantity -= qty;                   

        System.out.println(qty + " units sold. Total price: " + total);
    }

    @Override
    public void checkExpiry() {
        if (expiryDate.isBefore(LocalDate.now())) {
            System.out.println(name + " is expired");
        } else {
            System.out.println(name + " is valid");
        }
    }
}
