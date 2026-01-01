package com.encapsulation.fooddeliverysystem;

public class FoodDeliverySystem {

    // Method to process any type of food item
    public static void processOrder(FoodItem item) {

        double total = item.calculateTotalPrice();
        double discount = 0;

        if (item instanceof Discountable) {
            discount = ((Discountable) item).applyDiscount();
        }

        double finalAmount = total - discount;

        System.out.println(item.getItemDetails());
        System.out.println("Total Price   : " + total);
        System.out.println("Discount      : " + discount);
        System.out.println("Final Amount  : " + finalAmount);
        System.out.println();
    }

    // Main method to test polymorphism
    public static void main(String[] args) {

        FoodItem f1 = new VegItem("Paneer Roll", 120, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 250, 1);

        processOrder(f1);
        processOrder(f2);
    }
}

