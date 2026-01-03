package com.day01.hospitalmanagementsystem;

import java.util.ArrayList;

class Patient {

    private int patientId;
    private String name;

    // Still using ArrayList — but only storing one entry initially
    private ArrayList<String> medicalHistory = new ArrayList<>();

    protected String doctorAssigned;
    protected boolean isEmergency;

    // Normal Admission Constructor
    public Patient(int patientId, String name, String doctorAssigned, String historyRecord){
        this.patientId = patientId;
        this.name = name;
        this.doctorAssigned = doctorAssigned;
        this.isEmergency = false;

        medicalHistory.add(historyRecord);  // Add ONE record
    }

    // Emergency Admission Constructor
    public Patient(int patientId, String name, String historyRecord){
        this.patientId = patientId;
        this.name = name;
        this.doctorAssigned = "Emergency Doctor";
        this.isEmergency = true;

        medicalHistory.add(historyRecord);  // Add ONE record
    }

    public String getSummary(){
        return "Patient ID: " + patientId +
                "\nName: " + name +
                "\nDoctor: " + doctorAssigned +
                "\nEmergency: " + (isEmergency ? "YES" : "NO") +
                "\nTotal Records: " + medicalHistory.size();
    }

    public void showMedicalHistory(){
        System.out.println("\nMedical History of " + name + ":");
        for(String record : medicalHistory){
            System.out.println("- " + record);
        }
    }

    public void displayInfo(){
        System.out.println("Patient: " + name);
    }
}
