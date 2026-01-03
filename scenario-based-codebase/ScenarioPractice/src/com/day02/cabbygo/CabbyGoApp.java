package com.day02.cabbygo;

import java.util.Scanner;

public class CabbyGoApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CabbyGo Ride Booking ===");

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Driver Name: ");
        String driverName = sc.nextLine();

        System.out.print("Enter Driver License Number: ");
        String license = sc.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = sc.nextDouble();

        System.out.print("Enter Ride Distance (km): ");
        double distance = sc.nextDouble();

        // Creating objects using user input
        Vehicle v = new Sedan(vehicleNumber, capacity);
        Driver d = new Driver(driverName, license, rating);

        RideService ride = new RideService(v, d);

        ride.bookRide(distance);
        ride.endRide();

        sc.close();
    }
}
