package com.day03.campusconnect;
import java.util.*;

public class Student extends Person implements ICourseActions {

    private List<Course> courses = new ArrayList<>();
    private List<Double> grades = new ArrayList<>(); // private as required

    public Student(String name, String email, String id) {
        super(name, email, id);
    }

    @Override
    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    @Override
    public void dropCourse(Course c) {
        courses.remove(c);
        c.removeStudent(this);
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        double sum = 0;
        for(double g : grades) sum += g;
        return grades.size() > 0 ? sum / grades.size() : 0;
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + name + ", GPA: " + calculateGPA());
    }
}
