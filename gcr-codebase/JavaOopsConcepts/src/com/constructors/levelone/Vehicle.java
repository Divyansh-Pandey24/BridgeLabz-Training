package com.constructors.levelone;

public class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 5000;

    // Parameterized constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }
    
    // Class method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohan", "Car");
        Vehicle v2 = new Vehicle("Neha", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

