// Writing a code to covert the height from centimeters to feet and inches

// Create HeightConversion class to covert the height from centimeters to feet and inches

import java.util.Scanner;
public class HeightConversion{

 public static void main(String []args){

   // Input to store height in centimeters
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the height in centimeters: ");
    double height=input.nextDouble();

   // Logic for the conversion to inches 
    double inches=height/2.54;
    double feet=inches/12;

  // Displaying the results
    System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);
    
 }
}