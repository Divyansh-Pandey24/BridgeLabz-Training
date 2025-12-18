// Writing a program to find the bonus of employees based on their years of service.
// Create EmployeeBonus class

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        // Logic to check the bonus amount
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount = " + bonus);
        } else {
            System.out.println("Employee is not eligible for bonus.");
        }

    }
}
