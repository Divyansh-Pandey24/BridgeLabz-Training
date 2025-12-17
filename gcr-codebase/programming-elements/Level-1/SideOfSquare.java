// Writing a code to find out the side of a square
// Create SideOfSquare class to find out the area of a triangle

import java.util.Scanner;
public class SideOfSquare{
 public static void main(String[] args){
  
  // Input to take perimeter
  Scanner input=new Scanner(System.in);
  System.out.println("Enter the perimeter: ");
  double perimeter=input.nextDouble();
  
  // Logic to find out side of a square
  double side=perimeter/4;
  
  // Displaying the results
  System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
 }
}

