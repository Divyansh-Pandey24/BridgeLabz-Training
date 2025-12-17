// Writing a code to calculate area of triangle
// Create a AreaOfTriangle class to calculate area of triangle

import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[]args){
    
        // Take base and height as input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of triangle in inches : " );
        double baseInInches = sc.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = sc.nextDouble();


        // Calculate the area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // Convert the area to square centimeters 
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;
        
        //Displaying the area of triangle in square inches and square centimeters
        System.out.println("Area of triangle in square inches is : " + areaInSquareInches +
                           " and in square centimeters is : " + areaInSquareCentimeters);

        sc.close();
    }
}