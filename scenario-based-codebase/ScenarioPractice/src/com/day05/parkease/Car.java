package com.day05.parkease;
public class Car extends Vehicle {

    public Car(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double calculateCharges(int hours) {

        double baseRate = 50; // per hour
        double total = baseRate * hours;

        if (hours > 5) {
            total += 200; // penalty
        }
        return total;
    }
}
