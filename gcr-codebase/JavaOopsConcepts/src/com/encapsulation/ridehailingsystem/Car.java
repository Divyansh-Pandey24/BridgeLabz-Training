package com.encapsulation.ridehailingsystem;

public class Car extends Vehicle implements GPS {

    private String currentLocation;

    // Constructor to initialize car
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    // Fare for car
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Get current GPS location
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Update GPS location
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

