package com.encapsulation.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department {

    private String department;
    private int hoursWorked;

    // Constructor to initialize part-time employee
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    // Salary based on hours worked
    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    // Assign department name
    @Override
    public void assignDepartment(String deptName) {
        department = deptName;
    }

    // Return department name
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
