package com.day05.parkease;
public abstract class Vehicle implements IPayable {

    protected String numberPlate;

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }
}
