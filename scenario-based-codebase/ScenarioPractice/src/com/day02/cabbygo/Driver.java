package com.day02.cabbygo;
public class Driver {

    String name;
    String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
}
