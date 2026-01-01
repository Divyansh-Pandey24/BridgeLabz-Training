package com.encapsulation.ecommerceplatform;

public class Electronics extends Product implements Taxable {

    // Constructor to initialize electronics item
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Discount on electronics
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    // Tax on electronics
    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    // Tax information
    @Override
    public String getTaxDetails() {
        return "18% GST applied";
    }
}

