package com.encapsulation.hospitalsystem;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Constructor to initialize patient details
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter methods for encapsulation
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to calculate bill amount
    public abstract double calculateBill();

    // Method to return patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

