package com.encapsulation.hospitalsystem;

import java.util.ArrayList;

public class InPatient extends Patient implements MedicalRecord {

    private double roomChargePerDay;
    private int daysAdmitted;
    private ArrayList<String> records;

    // Constructor to initialize inpatient details
    public InPatient(int patientId, String name, int age, double roomChargePerDay, int daysAdmitted) {
        super(patientId, name, age);
        this.roomChargePerDay = roomChargePerDay;
        this.daysAdmitted = daysAdmitted;
        this.records = new ArrayList<>();
    }

    // Calculate bill for inpatients
    @Override
    public double calculateBill() {
        return roomChargePerDay * daysAdmitted;
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

