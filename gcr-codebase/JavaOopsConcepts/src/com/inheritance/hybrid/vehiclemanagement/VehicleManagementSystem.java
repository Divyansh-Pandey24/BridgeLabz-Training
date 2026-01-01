package com.inheritance.hybrid.vehiclemanagement;

public class VehicleManagementSystem {

    public static void main(String[] args) {

        // demonstration of hybrid inheritance
        Vehicle ev = new ElectricVehicle("Mustang EV 4", 222, 57);
        Vehicle pv = new PetrolVehicle("Verna", 188, 44);

        ev.displayInfo();
        
        ElectricVehicle ev1 = (ElectricVehicle) ev;
        ev1.charge();
        System.out.println("---------------------");

        PetrolVehicle pv1 = (PetrolVehicle) pv;
        pv.displayInfo();
        pv1.refuel();
    }
}
