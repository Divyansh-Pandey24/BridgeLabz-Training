package com.day03.swiftcartapp;
import java.util.*;

public class SwiftCartApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cart cart = new Cart();

        System.out.println("Enter number of products to add:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter product name:");
            String name = sc.nextLine();

            System.out.println("Enter price:");
            double price = sc.nextDouble();

            System.out.println("Enter quantity:");
            int qty = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter category (Perishable / NonPerishable):");
            String cat = sc.nextLine();

            Product p;

            if (cat.equalsIgnoreCase("Perishable")) {
                p = new PerishableProduct(name, price, cat, qty);
            } else {
                p = new NonPerishableProduct(name, price, cat, qty);
            }

            cart.addProduct(p);
        }

        cart.generateBill();

        System.out.println("\nEnter coupon amount:");
        double coupon = sc.nextDouble();

        cart.applyDiscount(coupon);

        sc.close();
    }
}
