package com.day02.cabbygo;

public class Mini extends Vehicle {

    public Mini(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Mini");
    }

    public double getRatePerKm() {
        return 10.0;
    }
}
