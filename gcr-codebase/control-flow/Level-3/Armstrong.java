// Writing a program to check if a number is Armstrong or not
// Create Armstrong class

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        //Take input from user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int originalNumber= sc.nextInt();

        // Create a variable to store the result and copy the value of original number
        int sum= 0;
        int number= originalNumber;

        // Count the digits
        int count=0;
        while (number != 0) {
               count+=1;
               number/=10;
        }
     
        // Logic to find out the sum using while loop
        number = originalNumber;
        while (number != 0) {

               int digit= number % 10;
               sum+= (int)Math.pow(digit,count);
               number/=10;
        }
        // Displaying the results
        if (sum == originalNumber) {
            System.out.println("Yes, the number is a Armstrong number");
        }  else {
            System.out.println("No, the number is not a Armstrong number");
        }
        sc.close();
    }
}