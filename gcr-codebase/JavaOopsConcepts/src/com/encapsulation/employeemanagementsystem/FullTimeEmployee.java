package com.encapsulation.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department {

    private String department;

    // Constructor to initialize full-time employee
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Salary is same as base salary for full-time employee
    @Override
    public double calculateSalary() {
        return getBaseSalary();
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

