package com.encapsulation.hospitalsystem;

import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private ArrayList<String> records;

    // Constructor to initialize outpatient details
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    // Calculate bill for outpatients
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Add medical record
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    // View all stored records
    @Override
    public void viewRecords() {
        for (String r : records) {
            System.out.println(r);
        }
    }
}

