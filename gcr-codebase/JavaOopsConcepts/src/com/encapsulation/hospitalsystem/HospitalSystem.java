package com.encapsulation.hospitalsystem;

public class HospitalSystem {

    // Method to display billing details
    public static void processPatient(Patient patient) {

        System.out.println(patient.getPatientDetails());
        System.out.println("Bill Amount : " + patient.calculateBill());
        System.out.println();
    }

    // Main method to test polymorphism
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rohan", 35, 2000, 5);
        Patient p2 = new OutPatient(102, "Sneha", 28, 500);

        processPatient(p1);
        processPatient(p2);
    }
}

