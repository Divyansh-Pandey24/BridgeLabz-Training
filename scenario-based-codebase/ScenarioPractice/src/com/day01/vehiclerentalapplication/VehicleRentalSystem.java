package com.day01.vehiclerentalapplication;
public class VehicleRentalSystem {

    public static void main(String[] args) {

        // Customers
        Customer c1 = new Customer("Rohan", "9876543210");
        Customer c2 = new Customer("Meera", "9998887776");

        c1.displayInfo();
        c2.displayInfo();


        // Vehicles
        Bike bike = new Bike("B101", "Honda", 400);
        Car car = new Car("C202", "Hyundai", 1500);
        Truck truck = new Truck("T303", "Tata", 2500);

        System.out.println("\n--- Vehicle Details ---");
        bike.displayDetails();
        car.displayDetails();
        truck.displayDetails();


        // Rent Calculations (Polymorphism in action)
        System.out.println("\n--- Rent Calculation ---");

        System.out.println("Bike for 3 days: ₹" + bike.calculateRent(3));
        System.out.println("Car for 2 days: ₹" + car.calculateRent(2));
        System.out.println("Truck for 5 days: ₹" + truck.calculateRent(5));
    }
}
