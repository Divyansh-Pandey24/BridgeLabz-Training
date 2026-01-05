package com.day03.swiftcartapp;
public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    public double applyProductDiscount(double total) {
        return total - 10;   // example: ₹10 discount
    }
}
