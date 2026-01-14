package com.day03.smartcheckout;

import java.util.*;

public class SmartCheckoutApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductLog log = new ProductLog();

        // -------- INVENTORY SETUP --------
        while (true) {
            System.out.println("\nADD ITEMS IN THE INVENTORY");
            System.out.println("Press 1 to add item");
            System.out.println("Press 0 to stop");

            int input = sc.nextInt();
            if (input == 0) break;

            System.out.print("Enter product name: ");
            String name = sc.next();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter stock: ");
            double stock = sc.nextDouble();

            log.addItems(name, price, stock);
        }

        // -------- CUSTOMER QUEUE --------
        Queue<Customer> queue = new LinkedList<>();

        System.out.print("\nEnter number of customers: ");
        int customers = sc.nextInt();

        for (int i = 1; i <= customers; i++) {

            System.out.println("\nCustomer " + i);
            log.showProducts();

            System.out.print("How many items?: ");
            int count = sc.nextInt();

            List<String> items = new ArrayList<>();

            for (int j = 0; j < count; j++) {
                System.out.print("Enter item name: ");
                String name = sc.next();
                items.add(name);
                System.out.print("No of items");
                log.updateStock(name, sc.nextInt());
            }

            queue.add(new Customer(items));
        }

        System.out.println("Thank you for visiting");
        sc.close();
    }
}
