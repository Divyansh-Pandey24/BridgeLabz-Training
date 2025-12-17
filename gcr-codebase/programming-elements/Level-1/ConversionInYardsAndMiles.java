// Writing a code to find out the distance in yards and miles from feets
// Create ConversionInYardsAndMiles class to find out the distance in yards and miles from feets

import java.util.Scanner;
public class ConversionInYardsAndMiles{
 public static void main(String[] args){
  
  // Input the distance in feet
  Scanner input=new Scanner(System.in);
  System.out.print("Enter the distance in feet : ");
  double distanceInFeet= input.nextDouble();

  // Logic to find out the distance in yards and miles
  double distanceInYards= distanceInFeet/3;
  double distanceInMiles= distanceInYards/1760;
  
  // Displaying the results
  System.out.println("Your distance in feets is " + distanceInFeet + " while in yards is " + distanceInYards + " and mile is " +distanceInMiles );

input.close();

 }
}