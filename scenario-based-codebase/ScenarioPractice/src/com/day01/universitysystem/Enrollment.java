package com.day01.universitysystem;

public class Enrollment implements Graded {

    private Student student;
    private Course course;
    private String grade;

    // Constructor to link student and course
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Assign grade and convert to grade points
    @Override
    public void assignGrade(String grade) {
        this.grade = grade;

        double gradePoint = 0;

        if (grade.equals("A")) gradePoint = 4.0;
        else if (grade.equals("B")) gradePoint = 3.0;
        else if (grade.equals("C")) gradePoint = 2.0;
        else if (grade.equals("PASS")) gradePoint = 3.5;
        else gradePoint = 0;

        student.addGradePoints(gradePoint);
    }
}
