package com.inheritance.hierarchical.employeemanagementsystem;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Polymorphism: parent reference holding different employee types
    	
        Employee emp1 = new Manager("Vaidik", 105, 75000, 8);
        Employee emp2 = new Developer("Suhani", 106, 60000, "Java");
        Employee emp3 = new Intern("Gaury", 107, 15000, 6);

        emp1.displayDetails();
        System.out.println("---------------------");

        emp2.displayDetails();
        System.out.println("---------------------");

        emp3.displayDetails();
    }
}
