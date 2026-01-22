package com.day9.medwarehouse;

public class Medicine {
    String name;
    int expiryDate; 

    Medicine(String name, int expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    void display() {
        System.out.println(name + " -> Expiry: " + expiryDate);
    }
}