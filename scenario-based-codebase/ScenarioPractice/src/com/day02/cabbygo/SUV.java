package com.day02.cabbygo;

public class SUV extends Vehicle {

    public SUV(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "SUV");
    }

    public double getRatePerKm() {
        return 20.0;
    }
}
