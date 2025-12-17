//Writing a code to convert the distance from kilometers to miles

import java.util.Scanner;

// Create kilometersToMiles class to convert the distance from kilometers to miles
public class KiloToMiles
{
 public static void main(String []args)
  {

     Scanner input = new Scanner(System.in);
  
     // Create a variable to store the value in kilometer 
     double km;
     System.out.print("Enter distance in km: ");
     km=input.nextDouble();
      
    // Create a variable to store the value in miles
     double miles = km / 1.6;

    // Print total miles and the given km
     System.out.println("The total miles is " + miles +
                        " mile for the given " + km + " km");
 
   
 }
}