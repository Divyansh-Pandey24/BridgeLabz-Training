/*
11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

public class TemperatureLogger {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        // Number of days
        int days= 7;
        double[] temperature= new double[days];
        double sum =0.0, average;
        double maxTemperature = Integer.MIN_VALUE;

        System.out.println("======================================");
        System.out.printf("  %s\n","Welcome to Temperature Logger");
        System.out.println("======================================\n");
        System.out.println("Enter the Temperature:");

        // Loop to find out the maximum temperature and taking input from the user
        for(int i=0; i<days; i++) {
            System.out.printf("- Day%d temperature: ",i+1);
            temperature[i]=sc.nextDouble();

            sum += temperature[i];

            if(temperature[i] > maxTemperature) {
               maxTemperature = temperature[i];
            }
        }
        
        // Average of temperatures
        average= sum/7;
         
        // Displaying the results
        System.out.println("\n-------------------------------------------------------");
        System.out.printf(" %-20s |  %-20s%n","Average Temperature","MaxTemperature");
        System.out.println("-------------------------------------------------------");
        System.out.printf(" %-20.2f |  %-20.2f%n",average,maxTemperature);
        System.out.println("-------------------------------------------------------");

        sc.close();
        
    }
}