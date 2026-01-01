package com.inheritance.multilevel.onlineretail;

public class OnlineRetailOrderManagement {

    public static void main(String[] args) {

        // Demonstration of multiple inheritance
    	
        Order order1 = new Order(101, "2025-01-09");
        Order order2 = new ShippedOrder(102, "2025-01-11", "IMK12345");
        Order order3 = new DeliveredOrder(103, "2025-02-12", "IMK67890", "2025-01-15");

        System.out.println(order1.getOrderStatus());
        System.out.println(order2.getOrderStatus());
        System.out.println(order3.getOrderStatus());
    }
}
