package com.day02.cabbygo;

public abstract class Vehicle {

    String vehicleNumber;
    int capacity;
    String type;

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public abstract double getRatePerKm();
}
