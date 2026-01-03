package com.day01.universitysystem;

public class UniversitySystem {

    public static void main(String[] args) {

        Student s1 = new Undergraduate("UG101", "Rohan");
        Student s2 = new Postgraduate("PG202", "Sneha");

        Course c1 = new Course("CS01", "OOP");
        Course c2 = new Course("CS02", "AI");

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c2);

        e1.assignGrade("A");       // Letter grade
        e2.assignGrade("PASS");    // Pass/Fail grade

        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
    }
}
