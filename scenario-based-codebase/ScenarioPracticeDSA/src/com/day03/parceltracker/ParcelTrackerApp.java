package com.day03.parceltracker;

import java.util.Scanner;

public class ParcelTrackerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Parcel parcel = new Parcel();

        while (true) {
            System.out.println("\n--- Parcel Tracker Menu ---");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Custom Checkpoint");
            System.out.println("3. Mark Parcel Lost");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  

            if (choice == 0) break;

            switch (choice) {

                case 1:
                    parcel.trackParcel();
                    break;

                case 2:
                    System.out.print("Add new stage after: ");
                    String after = sc.nextLine();

                    System.out.print("Enter new stage name: ");
                    String newStage = sc.nextLine();

                    parcel.addCheckpoint(after, newStage);
                    break;

                case 3:
                    System.out.print("Enter stage after which parcel is lost: ");
                    String stage = sc.nextLine();
                    parcel.markLost(stage);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
