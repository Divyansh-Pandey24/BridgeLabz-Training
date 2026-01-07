package com.day05.parkease;

import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingManager manager = new ParkingManager();

        // Create some sample slots
        manager.addSlot(new ParkingSlot(1, "Zone A", "Car"));
        manager.addSlot(new ParkingSlot(2, "Zone B", "Bike"));
        manager.addSlot(new ParkingSlot(3, "Zone C", "Truck"));

        System.out.println("=== Welcome to ParkEase Smart Parking ===");

        System.out.print("Enter Vehicle Number Plate: ");
        String number = sc.nextLine();

        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");
        System.out.print("Enter choice: ");
        int type = sc.nextInt();

        Vehicle vehicle;

        if (type == 1)
            vehicle = new Car(number);
        else if (type == 2)
            vehicle = new Bike(number);
        else
            vehicle = new Truck(number);

        ParkingSlot slot = null;

        if (type == 1)
            slot = manager.assignSlot("Car");
        else if (type == 2)
            slot = manager.assignSlot("Bike");
        else
            slot = manager.assignSlot("Truck");

        if (slot == null) {
            System.out.println("\n No slot available for your vehicle.");
            sc.close();
            return;
        }

        System.out.println("\n Slot Assigned: " + slot.getSlotId() + " at " + slot.getLocation());

        System.out.print("\nEnter Parking Duration (hours): ");
        int hours = sc.nextInt();

        double charges = vehicle.calculateCharges(hours);

        System.out.println("\nParking Charges = " + charges);

        manager.releaseSlot(slot);

        manager.showLogs();

        sc.close();
    }
}
