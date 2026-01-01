package com.encapsulation.fooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

    // Constructor to initialize non-veg item
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Total price for non-veg item including extra charge
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    // Apply discount on non-veg item
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.03;
    }

    // Discount information
    @Override
    public String getDiscountDetails() {
        return "3% discount on non-veg items";
    }
}

