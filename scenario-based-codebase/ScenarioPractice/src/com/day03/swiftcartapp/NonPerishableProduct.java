package com.day03.swiftcartapp;
public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    public double applyProductDiscount(double total) {
        return total - 5;   // example: ₹5 discount
    }
}
