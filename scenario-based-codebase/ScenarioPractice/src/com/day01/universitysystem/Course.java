package com.day01.universitysystem;

public class Course {

    private String courseId;
    private String title;

    // Constructor to initialize course
    public Course(String courseId, String title) {
        this.courseId = courseId;
        this.title = title;
    }

    public String getCourseTitle() {
        return title;
    }
}
