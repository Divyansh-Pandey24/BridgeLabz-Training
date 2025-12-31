/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

import java.util.Scanner;

public class DigitalWatchSimulation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);   
        System.out.print("=======================================================\n");
        System.out.print("\n------WELCOME TO DIGITAL WATCH SIMULATION-------\n");
        System.out.print("\n=======================================================\n");

        // Looping to print time and minutes
        for(int i = 0; i < 24; i++) {
          
            if(i == 13) {
              System.out.println("There is power cut");
              break;
            }
           
           for(int j=0; j < 60; j++) {

               System.out.printf(" %s: %02d Hours  : %02d Min\n","Time",i,j);
           }
        }

        sc.close();
    }
}