package com.encapsulation.fooddeliverysystem;

public abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize food item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods for encapsulation
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Method to return item details
    public String getItemDetails() {
        return itemName + " x " + quantity + " @ " + price;
    }
}

