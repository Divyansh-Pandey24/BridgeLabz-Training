package com.day10.hospitalqueuemanagement;
import java.time.LocalDateTime;

public class Patient {
    private int patientId;
    private String name;
    private LocalDateTime arrivalTime;

    public Patient(int patientId, String name, LocalDateTime arrivalTime) {
        this.patientId = patientId;
        this.name = name;
        this.arrivalTime = arrivalTime;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "ID: " + patientId + ", Name: " + name + ", Arrival: " + arrivalTime;
    }
}
