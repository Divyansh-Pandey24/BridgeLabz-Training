package com.day07.skillforge;
public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    public String generateCertificate(Student student) {
        return "Advanced Certification\nStudent: " + student.getName() +
               "\nCourse: " + title + "\nLevel: Advanced";
    }
}
