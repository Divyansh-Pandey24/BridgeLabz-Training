package com.day01.ambulanceroute;
import java.util.Scanner;

public class AmbulanceRoute {
    public static void main(String[] args) {
        HospitalRoute route = new HospitalRoute();
        Scanner sc = new Scanner(System.in);

        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");

        while (true) {
            System.out.println("\n1. Display Route");
            System.out.println("2. Find Nearest Available Unit");
            System.out.println("3. Put Unit Under Maintenance");
            System.out.println("4. Make Unit Available");
            System.out.println("5. Remove Unit (Permanent)");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                route.displayRoute();
            } else if (choice == 2) {
                String unit = route.findAvailableUnit();
                System.out.println("Patient directed to: " + unit);
            } else if (choice == 3) {
                System.out.print("Enter unit name: ");
                String unit = sc.nextLine();
                route.setMaintenance(unit, true);
                System.out.println(unit + " is now under maintenance");
            } else if (choice == 4) {
                System.out.print("Enter unit name: ");
                String unit = sc.nextLine();
                route.setMaintenance(unit, false);
                System.out.println(unit + " is now available");
            } else if (choice == 5) {
                System.out.print("Enter unit name to remove: ");
                String unit = sc.nextLine();
                route.removeUnit(unit);
                System.out.println(unit + " removed from route");
            } else if (choice == 6) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}