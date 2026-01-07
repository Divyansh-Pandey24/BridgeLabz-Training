package com.day05.parkease;
public class Truck extends Vehicle {

    public Truck(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double calculateCharges(int hours) {

        double baseRate = 100;

        double total = baseRate * hours;

        if (hours > 5) {
            total += 300;
        }
        return total;
    }
}
