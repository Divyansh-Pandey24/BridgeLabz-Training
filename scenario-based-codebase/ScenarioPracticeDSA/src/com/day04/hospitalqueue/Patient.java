package com.day04.hospitalqueue;
class Patient {
    String name;
    int criticality;   // 1 to 10
    int arrivalOrder;

    Patient(String name, int criticality, int arrivalOrder) {
        this.name = name;
        this.criticality = criticality;
        this.arrivalOrder = arrivalOrder;
    }

    void display() {
        System.out.println(name + " | Criticality: " + criticality + " | Arrival: " + arrivalOrder);
    }
}
