package com.inheritance.hierarchical.schoolsystem;

public class SchoolSystemWithDifferentRoles {

    public static void main(String[] args) {

        // Hierarchical inheritance demonstration
        Person p1 = new Teacher("Mr. Mishre", 55, "Social Science");
        Person p2 = new Student("Puri", 15, "12th Grade");
        Person p3 = new Staff("Harsh", 45, "Administration");

        p1.displayDetails();
        p1.displayRole();
        
        System.out.println("---------------------");

        p2.displayDetails();
        p2.displayRole();
        
        System.out.println("---------------------");

        p3.displayDetails();
        p3.displayRole();
    }
}
