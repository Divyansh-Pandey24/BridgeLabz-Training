package com.encapsulation.employeemanagementsystem;

public class EmployeeManagementSystem {

    // Main method to test polymorphism
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(1, "Jacky", 40000);
        Employee e2 = new PartTimeEmployee(2, "Sneha", 500, 40);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
    }
}

