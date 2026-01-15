package com.day04.hospitalqueue;
public class HospitalApp {
    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("Ravi", 4, 1),
            new Patient("Anita", 9, 2),
            new Patient("Suresh", 3, 3),
            new Patient("Pooja", 7, 4),
            new Patient("Amit", 10, 5)
        };

        System.out.println("Before Sorting (Arrival Order):");
        HospitalQueue.display(patients);

        HospitalQueue.sortByCriticality(patients);

        System.out.println("\nAfter Sorting (By Criticality):");
        HospitalQueue.display(patients);
    }
}
