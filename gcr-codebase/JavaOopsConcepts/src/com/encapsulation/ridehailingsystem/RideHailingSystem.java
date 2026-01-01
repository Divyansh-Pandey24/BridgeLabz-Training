package com.encapsulation.ridehailingsystem;

public class RideHailingSystem {

    // Method to process vehicle and calculate fare
    public static void processRide(Vehicle vehicle, double distance) {

        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km : " + vehicle.calculateFare(distance));
        System.out.println();
    }

    // Main method to test polymorphism
    public static void main(String[] args) {

        Vehicle v1 = new Car("C101", "Rohan", 15);
        Vehicle v2 = new Bike("B202", "Sneha", 10);
        Vehicle v3 = new Auto("A303", "Amit", 12);

        processRide(v1, 10);
        processRide(v2, 10);
        processRide(v3, 10);
    }
}
