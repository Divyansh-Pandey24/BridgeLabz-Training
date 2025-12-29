/*
6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;

public class ParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ Welcome to the Parking Lot -----------");

        // Total parking slots available
        int totalLots = 2;

        // Currently occupied slots
        int occupiedLots = 0;
        
        while (true) {

            // Display menu options to the user
            System.out.println("\nOptions: Park | Exit | Show-Occupancy | Close");
            System.out.print("Enter option: ");

            String option = sc.next().toLowerCase();

            if (option.equals("close")) {
                System.out.println("Thank You for visiting!");
                break;  
            }

            if (occupiedLots == totalLots && !option.equals("exit")) {
                System.out.println("Sorry! The parking lot is FULL");
                continue;  
            }

            switch (option) {

                case "park":
                    System.out.println("Vehicle parked successfully.");
                    occupiedLots++;   
                    break;

                case "exit":
                    if (occupiedLots == 0) {
                        System.out.println("No cars are currently parked.");
                        break;
                    }
                    System.out.println("Vehicle exited successfully.");
                    occupiedLots--;  
                    break;

                case "show-occupancy":
                    System.out.printf("Occupied Slots: %d / %d\n", occupiedLots, totalLots);
                    break;

                default:
                    System.out.println("Invalid Option. Please try again.");
            }
        }

        sc.close();
    }
}
