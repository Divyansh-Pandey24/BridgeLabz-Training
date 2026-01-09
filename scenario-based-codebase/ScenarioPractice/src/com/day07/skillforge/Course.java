package com.day07.skillforge;
import java.util.List;

public abstract class Course implements ICertifiable {

    protected String title;
    protected Instructor instructor;
    protected String[] modules;

    protected double rating;
    private int reviewCount;

    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[] { "Introduction", "Basics", "Final Project" };
    }

    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    protected void updateRating(double newRating) {
        rating = (rating * reviewCount + newRating) / (++reviewCount);
    }

    public double getRating() {
        return rating;
    }

    public String[] getModules() {
        return modules;
    }
}
