package com.encapsulation.vehiclerentalsystem;

public abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter methods for encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);
}

