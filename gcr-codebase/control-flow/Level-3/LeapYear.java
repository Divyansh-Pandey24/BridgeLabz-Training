// Writing a program to check whether a year is a leap year or not
// Create LeapYear class

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        
        //Take input from user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year= sc.nextInt();
        
        // Logic to check the leap year and displaying the results
        if (year < 1582) {
           System.out.println(" Wrong input according to Gregorian Calender ");
        } else if (year % 400 == 0) {
           System.out.println("Year is a Leap Year");
        } else if (year % 4 == 0) {
           if (year % 100 !=0) {
               System.out.println("Year is a Leap Year");
           } else {
               System.out.println("Year is not a Leap Year");
           }
        } else {
             System.out.println("Year is not a Leap Year");
        }
        sc.close();
    }
}
