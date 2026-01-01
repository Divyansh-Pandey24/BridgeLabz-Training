package com.encapsulation.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    // Constructor to initialize bike details
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculate rental cost for bike
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Calculate insurance for bike
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    // Return insurance policy number
    @Override
    public String getInsuranceDetails() {
        return insurancePolicyNumber;
    }
}

