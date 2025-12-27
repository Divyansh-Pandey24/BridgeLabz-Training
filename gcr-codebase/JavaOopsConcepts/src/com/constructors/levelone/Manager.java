package com.constructors.levelone;

public class Manager extends Employee {

    Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager(501, "IT", 80000);
        m.updateSalary(90000);
        m.displayDetails();
    }
}

