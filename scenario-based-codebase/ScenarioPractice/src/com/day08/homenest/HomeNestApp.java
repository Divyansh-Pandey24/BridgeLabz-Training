package com.day08.homenest;


import java.util.HashMap;
import java.util.Scanner;

public class HomeNestApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Users
        User u1 = new User("Divyansh");
        User u2 = new User("Akshat");

        // Devices
        Device d1 = new Camera(100, true, 20, u1);
        Device d2 = new Light(101, false, 10, u1);
        Device d3 = new Light(102, true, 5, u2);
        Device d4 = new Lock(103, true, 6, u2);
        Device d5 = new Lock(104, false, 8, u1);

        // Store devices by ID 
        HashMap<Integer, Device> devices = new HashMap<>();
        devices.put(100, d1);
        devices.put(101, d2);
        devices.put(102, d3);
        devices.put(103, d4);
        devices.put(104, d5);

        while (true) {

            System.out.println("\n===== HomeNest Control Panel =====");
            System.out.println("1. Turn ON device");
            System.out.println("2. Turn OFF device");
            System.out.println("3. Reset device");
            System.out.println("4. Check device status");
            System.out.println("5. Calculate energy usage");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Exiting HomeNest...");
                break;
            }

            System.out.print("Enter Device ID: ");
            int id = sc.nextInt();

            Device device = devices.get(id);

            if (device == null) {
                System.out.println("Invalid Device ID!");
                continue;
            }

            switch (choice) {

                case 1:
                    device.turnOn();
                    System.out.println("Device turned ON");
                    break;

                case 2:
                    device.turnOff();
                    System.out.println("Device turned OFF");
                    break;

                case 3:
                    device.reset();
                    System.out.println("Device reset");
                    break;

                case 4:
                    System.out.println("Device Status: " +
                            (device.getStatus() ? "ON" : "OFF"));
                    break;

                case 5:
                    System.out.print("Enter usage time (hours): ");
                    double time = sc.nextDouble();
                    double energy = device.calculateEnergy(time);
                    System.out.println("Energy Consumed: " + energy);
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

        sc.close();
    }
}

