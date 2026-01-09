package com.day07.skillforge;
public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public BeginnerCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    public String generateCertificate(Student student) {
        return "Certificate of Completion\nStudent: " + student.getName() +
               "\nCourse: " + title + "\nLevel: Beginner";
    }
}
