package com.day01.vehiclerentalapplication;

class Truck extends Vehicle implements Rentable {

    private double loadSurcharge = 1500;   // fixed extra

    public Truck(String id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {

        // Trucks have a one-time surcharge
        return (baseRatePerDay * days) + loadSurcharge;
    }
}
