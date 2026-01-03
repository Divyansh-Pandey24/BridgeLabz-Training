package com.day02.cabbygo;

public class Sedan extends Vehicle {

    public Sedan(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Sedan");
    }

    public double getRatePerKm() {
        return 15.0;
    }
}
