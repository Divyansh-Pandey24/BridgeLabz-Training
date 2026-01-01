package com.encapsulation.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    // Constructor to initialize truck details
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculate rental cost for truck
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    // Calculate insurance for truck
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    // Return insurance policy number
    @Override
    public String getInsuranceDetails() {
        return insurancePolicyNumber;
    }
}

