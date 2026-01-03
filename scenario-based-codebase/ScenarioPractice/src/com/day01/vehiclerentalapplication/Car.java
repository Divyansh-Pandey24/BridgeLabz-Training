package com.day01.vehiclerentalapplication;

class Car extends Vehicle implements Rentable {

    private double driverChargePerDay = 500;   // extra charge

    public Car(String id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {

        // Rent = base + driver cost
        return (baseRatePerDay * days) + (driverChargePerDay * days);
    }
}

