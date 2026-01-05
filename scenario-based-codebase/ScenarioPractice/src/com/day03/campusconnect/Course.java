package com.day03.campusconnect;
import java.util.*;

public class Course {

    private String courseName;
    private Faculty faculty;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public void printCourseDetails() {

        System.out.println("\nCourse: " + courseName);
        System.out.print("Faculty: ");
        faculty.printDetails();

        System.out.println("Students Enrolled:");
        for(Student s : students) {
            s.printDetails();
        }
    }
}
