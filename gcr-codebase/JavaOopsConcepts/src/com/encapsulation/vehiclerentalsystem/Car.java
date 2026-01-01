package com.encapsulation.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    // Constructor to initialize car details
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculate rental cost for car
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Calculate insurance for car
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    // Return insurance policy number
    @Override
    public String getInsuranceDetails() {
        return insurancePolicyNumber;
    }
}
