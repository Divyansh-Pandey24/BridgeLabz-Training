package com.day03.swiftcartapp;
public class Product {

    protected String name;
    protected double price;
    protected String category;
    protected int quantity;

    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;   // operator used
    }

    public double applyProductDiscount(double total) {
        return total;   // default (no discount here)
    }

    public void printProduct() {
        System.out.println(name + " (" + category + ") x " + quantity + " = " + getTotalPrice());
    }
}
