package com.encapsulation.employeemanagementsystem;

public abstract class Employee {

    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor to initialize employee details
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter methods for encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Setter to update base salary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method for salary calculation
    public abstract double calculateSalary();

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Base Salary : " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

