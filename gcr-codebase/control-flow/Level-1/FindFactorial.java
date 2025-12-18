// Writing a code to find the factorial of an integer
// Create FindFactorial class

import java.util.Scanner;

public class FindFactorial {

    public static void main(String[] args) {
    
        // Take input from the user
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number= input.nextInt();
        
        //Checking whether the user's input is positive or not
        if (number < 0) {
           System.out.println("Enter the positive number");
        } else {
           // Create a variable to store the result
           int factorial=1;

           // Logic to find out the factorial using while loop
           while (number > 1) {
           factorial*=number;
        
           // Decreasing the number by 1
           number-=1;
           }

           System.out.println(factorial);
        }

    }
}