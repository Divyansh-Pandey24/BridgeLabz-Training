package com.encapsulation.fooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {

    // Constructor to initialize veg item
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Total price for veg item
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Apply discount on veg item
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    // Discount information
    @Override
    public String getDiscountDetails() {
        return "5% discount on veg items";
    }
}

