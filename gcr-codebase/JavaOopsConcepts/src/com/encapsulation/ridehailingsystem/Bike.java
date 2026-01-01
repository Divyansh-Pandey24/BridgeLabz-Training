package com.encapsulation.ridehailingsystem;

public class Bike extends Vehicle implements GPS {

    private String currentLocation;

    // Constructor to initialize bike
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    // Fare for bike
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8;
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

