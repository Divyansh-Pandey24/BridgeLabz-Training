package com.constructors.levelone;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000; // example rate

    // Default constructor
    CarRental() {
        customerName = "Customer";
        carModel = "Basic";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double totalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Rahul", "Sedan", 5);

        System.out.println("Total cost: " + r1.totalCost());
        System.out.println("Total cost: " + r2.totalCost());
    }
}

