package com.day01.universitysystem;

public class Student {

    private String studentId;
    private String name;
    private double totalGradePoints;
    private int totalCourses;

    // Constructor to initialize student
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Method to add grade points for GPA calculation
    protected void addGradePoints(double gp) {
        totalGradePoints += gp;
        totalCourses++;
    }

    // Public method to get GPA
    public double getGPA() {
        if (totalCourses == 0) return 0;
        return totalGradePoints / totalCourses;
    }

    // Method to return transcript details
    public String getTranscript() {
        return name + " (" + studentId + ") GPA: " + getGPA();
    }
}
