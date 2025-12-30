/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char again = 'y'; 

        // looping to find out the total amount based on movie type, seat type, and snacks.
        while (again == 'y' || again == 'Y') {

            System.out.println("Welcome to Movie Ticket Booking App ");
            System.out.println("---------------------------");

            System.out.println("Select Movie Type:");
            System.out.println("1. 2D");
            System.out.println("2. 3D");
            System.out.println("3. IMAX");
            System.out.print("Enter choice (1,2,3): ");

            // Take movie input from the user
            int movie = sc.nextInt();

            // Take seat type from the user
            System.out.print("Enter Seat Type (gold/silver): ");
            String seat = sc.next();

            double ticketPrice = 0;

            switch (movie) {

                case 1: // 2D
                    if (seat.equalsIgnoreCase("gold"))
                        ticketPrice = 300;
                    else if (seat.equalsIgnoreCase("silver"))
                        ticketPrice = 200;
                    else {
                        System.out.println("Invalid seat type!");
                        continue;
                    }
                    break;

                case 2: // 3D
                    if (seat.equalsIgnoreCase("gold"))
                        ticketPrice = 400;
                    else if (seat.equalsIgnoreCase("silver"))
                        ticketPrice = 280;
                    else {
                        System.out.println("Invalid seat type!");
                        continue;
                    }
                    break;

                case 3: // IMAX
                    if (seat.equalsIgnoreCase("gold"))
                        ticketPrice = 550;
                    else if (seat.equalsIgnoreCase("silver"))
                        ticketPrice = 420;
                    else {
                        System.out.println("Invalid seat type!");
                        continue;
                    }
                    break;

                default:
                    System.out.println("Invalid movie selection!");
                    continue;
            }

            System.out.print("Do you want snacks? (yes/no): ");
            String snack = sc.next();

            double snackPrice = 0;
            if (snack.equalsIgnoreCase("yes"))
                snackPrice = 120;

            double total = ticketPrice + snackPrice;

            System.out.println("\n----- BILL -----");
            System.out.println("Ticket Price : Rs" + ticketPrice);
            System.out.println("Snacks       : Rs" + snackPrice);
            System.out.println("----------------");
            System.out.println("Total Amount : Rs" + total);
            System.out.println("----------------\n");

            System.out.print("Book for another customer? (y/n): ");
            again = sc.next().charAt(0);
        }

        System.out.println("\nThank you! Enjoy your movie ");
        sc.close();
    }
}
