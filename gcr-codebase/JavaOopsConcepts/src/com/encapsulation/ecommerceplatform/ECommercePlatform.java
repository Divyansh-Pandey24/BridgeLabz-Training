package com.encapsulation.ecommerceplatform;

public class ECommercePlatform {

    // Method to calculate and print final price
    public static void printFinalPrice(Product product) {

        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        double finalPrice = price + tax - discount;

        System.out.println("Product: " + product.getName());
        System.out.println("Base Price : " + price);
        System.out.println("Discount   : " + discount);
        System.out.println("Tax        : " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println();
    }

    // Main method to test polymorphism
    public static void main(String[] args) {

        Product p1 = new Electronics(1, "Laptop", 60000);
        Product p2 = new Clothing(2, "Jacket", 4000);
        Product p3 = new Groceries(3, "Rice Bag", 1200);

        printFinalPrice(p1);
        printFinalPrice(p2);
        printFinalPrice(p3);
    }
}

