package com.constructors.levelone;

public class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int roll, String name, double cgpa, String specialization) {
        super(roll, name, cgpa);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent(101, "Aman", 8.9, "Data Science");
        s.setCGPA(9.2);
        s.displayDetails();
    }
}

