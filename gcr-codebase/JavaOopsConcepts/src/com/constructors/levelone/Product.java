package com.constructors.levelone;

public class Product {
    String productName;    
    double price;            
    static int totalProducts = 0;   
    
    // Parameterized constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }
    // Method to display product details
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }
    // Method to display total products
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("TV", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}

