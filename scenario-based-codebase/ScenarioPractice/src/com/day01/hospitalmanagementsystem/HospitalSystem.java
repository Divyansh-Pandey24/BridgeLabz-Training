package com.day01.hospitalmanagementsystem;

public class HospitalSystem {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");
        Doctor d2 = new Doctor("Dr. Verma", "Neurology");

        d1.displayInfo();
        d2.displayInfo();

        // Normal OutPatient
        OutPatient p1 = new OutPatient(
                101,
                "Rohan",
                "Dr. Sharma",
                "Migraine Headache"
        );

        // Emergency OutPatient
        OutPatient p2 = new OutPatient(
                102,
                "Meera",
                "Severe Head Injury"
        );

        // Normal InPatient
        InPatient p3 = new InPatient(
                103,
                "Amit",
                "Dr. Verma",
                4,
                "Chest Pain"
        );

        // Emergency InPatient
        InPatient p4 = new InPatient(
                104,
                "Neha",
                3,
                "Road Accident Trauma"
        );

        System.out.println("\n--- Patient Summaries ---");
        System.out.println(p1.getSummary());
        System.out.println();
        System.out.println(p2.getSummary());
        System.out.println();
        System.out.println(p3.getSummary());
        System.out.println();
        System.out.println(p4.getSummary());

        System.out.println("\n--- Medical History Details ---");
        p1.showMedicalHistory();
        p2.showMedicalHistory();
        p3.showMedicalHistory();
        p4.showMedicalHistory();

        System.out.println("\n--- Polymorphism Output ---");
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        p4.displayInfo();

        // Billing
        Bill b1 = new Bill(20000, true);
        Bill b2 = new Bill(3000, false);

        System.out.println("\nFinal Bill (Patient 3): ₹" + b1.calculatePayment());
        System.out.println("Final Bill (Patient 1): ₹" + b2.calculatePayment());
    }
}

