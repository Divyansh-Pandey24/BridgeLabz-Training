package com.inheritance.hierarchical.vehicleandtransportsystem;

public class VehicleAndTransportSystem {

    public static void main(String[] args) {

        Vehicle v1= new Car(190, "Diesel", 5);
        Vehicle v2 = new Truck(120, "Diesel", 12.5);
        Vehicle v3 = new Motorcycle(140, "Petrol", true);
        
        v1.displayInfo();
        System.out.println("--------------------");
        v2.displayInfo();
        System.out.println("--------------------");
        v3.displayInfo();
        
    }
}
