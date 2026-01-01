package com.encapsulation.vehiclerentalsystem;

import java.util.ArrayList;

public class VehicleRentalSystem {

    // Method to display rental and insurance cost
    public static void printDetails(Vehicle vehicle, int days) {

        double rentalCost = vehicle.calculateRentalCost(days);
        double insurance = 0;
        String insuranceInfo = "Not Applicable";

        if (vehicle instanceof Insurable) {
            insurance = ((Insurable) vehicle).calculateInsurance();
            insuranceInfo = ((Insurable) vehicle).getInsuranceDetails();
        }

        System.out.println("Vehicle Number : " + vehicle.getVehicleNumber());
        System.out.println("Type           : " + vehicle.getType());
        System.out.println("Rental Cost    : " + rentalCost);
        System.out.println("Insurance Cost : " + insurance);
        System.out.println("Policy Number  : " + insuranceInfo);
        System.out.println();
    }

    // Main method to test polymorphism
    public static void main(String[] args) {

        ArrayList<Vehicle> list = new ArrayList<>();

        list.add(new Car("UP32 AB 1111", 2000, "CAR101"));
        list.add(new Bike("UP32 XY 2222", 500, "BIKE202"));
        list.add(new Truck("UP32 TR 3333", 5000, "TRUCK303"));

        for (Vehicle v : list) {
            printDetails(v, 5);
        }
    }
}

