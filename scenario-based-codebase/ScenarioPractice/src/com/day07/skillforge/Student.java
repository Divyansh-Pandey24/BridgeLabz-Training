package com.day07.skillforge;
public class Student extends User {

    private int completedModules;
    private int totalModules;
    private double score;

    public Student(String name, String email, int totalModules) {
        super(name, email);
        this.totalModules = totalModules;
    }

    public void completeModule() {
        completedModules++;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getProgress() {
        return (completedModules * 100.0) / totalModules;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
