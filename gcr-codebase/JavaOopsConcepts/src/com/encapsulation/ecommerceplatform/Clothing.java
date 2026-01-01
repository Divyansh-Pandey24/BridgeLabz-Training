package com.encapsulation.ecommerceplatform;

public class Clothing extends Product implements Taxable {

    // Constructor to initialize clothing item
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Discount on clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    // Tax on clothing
    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    // Tax information
    @Override
    public String getTaxDetails() {
        return "12% GST applied";
    }
}

