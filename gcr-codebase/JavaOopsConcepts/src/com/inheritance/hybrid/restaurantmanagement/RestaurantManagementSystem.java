package com.inheritance.hybrid.restaurantmanagement;

public class RestaurantManagementSystem {

    public static void main(String[] args) {

        // demonstration of hybrid inheritance
    	
        Worker worker1 = new Chef("Akshat", 105, "Indian");
        Worker worker2 = new Waiter("Ashish", 109, 7);

        worker1.performDuties();
        
        System.out.println("---------------------");

        worker2.performDuties();
    }
}
