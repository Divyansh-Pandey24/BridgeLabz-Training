// Writing a code to find the sum of numbers until the user enters 0
// Create SumOfNumbers class

import java.util.Scanner;

public class SumNumbers { 

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        // Create a variable to store the total
        double total=0.0;

        // Using while loop to calculate the sum util user enters 0
        while(true) {
           
        System.out.println("Enter the number: ");
        double number=input.nextDouble();
        
        // Using if block to check the user's input
        if(number<=0) {
         break;
        }
        
        // Adding the number in the total
        total=total+number;
        }
  
        // Displaying the result
        System.out.println(total);
   
    }
}