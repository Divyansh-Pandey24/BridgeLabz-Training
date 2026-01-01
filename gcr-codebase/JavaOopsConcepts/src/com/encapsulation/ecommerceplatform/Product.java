package com.encapsulation.ecommerceplatform;

public abstract class Product {

    private int productId;
    private String name;
    private double price;

    // Constructor to initialize product
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter methods for encapsulation
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter to update price
    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();
}

