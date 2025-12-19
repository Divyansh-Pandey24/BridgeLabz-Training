// Writing a program to check if the number is a prime number or not
// Create IsPrime class

import java.util.Scanner;

public class IsPrime {
    
    public static void main(String[] args) {
        
        //Take input from user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number greater than one: ");
        int number= sc.nextInt();

        //Logic to check valid number and check prime number or not
        if (number < 2) {
            System.out.println("Enter a valid numer");
        } else {
            boolean isPrime= true;
            for (int i=2; i<number; i++) {
                 if (number % i==0) {
                     isPrime= false;
                 }
            }
            if (isPrime) {
                System.out.println("The given number "+number+" is a prime number");
            } else {
                System.out.println("The given number "+number+" is not prime number");
            }
        }
        sc.close();
    }
}