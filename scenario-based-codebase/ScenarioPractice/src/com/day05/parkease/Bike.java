package com.day05.parkease;
public class Bike extends Vehicle {

    public Bike(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double calculateCharges(int hours) {

        double baseRate = 20;

        double total = baseRate * hours;

        if (hours > 5) {
            total += 100;
        }
        return total;
    }
}
