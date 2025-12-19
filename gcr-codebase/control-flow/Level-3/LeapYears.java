// Writing a program to check whether a year is a leap year or not using logical operators
// Create LeapYears class

import java.util.Scanner;

public class LeapYears {

    public static void main(String[] args) {
        
        //Take input from user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year= sc.nextInt();
        
        // Logic to check the leap year and displaying the results
        if ((year >= 1582) && (((year % 4==0) && (year % 100!=0)) || (year % 400==0))) {
           System.out.println("The year is a leap year");
        } else {
           System.out.println("The year is not a leap year");
        }
        sc.close();       
    }
}
