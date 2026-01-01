package com.encapsulation.ecommerceplatform;

public class Groceries extends Product {

    // Constructor to initialize grocery item
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Discount on groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

