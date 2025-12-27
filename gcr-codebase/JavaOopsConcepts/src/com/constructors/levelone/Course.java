package com.constructors.levelone;

public class Course {
    String courseName;
    int duration;
    double fee;

    static String instituteName = "LAS Institute";

    // Parameterized constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    
    // Method to display course details
    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println();
    }
    // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 20000);
        Course c2 = new Course("Python", 4, 15000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

