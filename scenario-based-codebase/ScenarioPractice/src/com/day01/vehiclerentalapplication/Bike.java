package com.day01.vehiclerentalapplication;

class Bike extends Vehicle implements Rentable {

    public Bike(String id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {

        // Bikes have no surcharge
        return baseRatePerDay * days;
    }
}

