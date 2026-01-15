package com.day04.examcell;
class Student {
    String name;
    int score;
    String center;

    Student(String name, int score, String center) {
        this.name = name;
        this.score = score;
        this.center = center;
    }

    void display() {
        System.out.println(name + "  Score: " + score + "  Center: " + center);
    }
}
