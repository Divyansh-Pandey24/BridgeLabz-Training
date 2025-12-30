/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

public class TrainReservation {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("=========Welcome to ticket counter============\n");
 
        // Variables to initialize number of tickets and booked 
        int availableTickets=100, bookedSeats= 0;

        // Looping to find out available seats, book tickts and cancel reservation
        while(true) {

           if(availableTickets-bookedSeats<=0) {
             System.out.println("---------------------------------------");
             System.out.println("No seats are available");
             System.out.println("---------------------------------------");
             break;
           }
           System.out.println("------Available Options--------");
           System.out.println("---------------------------------------\n");
           System.out.println("1. Book ticket");
           System.out.println("2. Cancel Reservation");
           System.out.println("3. View Available Seats");
           System.out.print("Enter the option: ");
           int option= sc.nextInt();

           switch(option) {
               case 1 ->{
                if(bookedSeats <= availableTickets) {
                  bookedSeats++;
                  System.out.println("The ticket is booked successfully");
                }
               }
               case 2 ->{
                if(bookedSeats > 0) {
                  bookedSeats--;
                  System.out.println("The ticket is cancelled successfully");
                }
                else {
                  System.out.println("No reservation found");
                }
               }
               case 3 ->{
                 System.out.println("Available seats: "+(availableTickets-bookedSeats));
               }
           }

        }
        
        sc.close();
     
    }
}
