package com.day04.examcell;
public class ExamCellApp {

    public static void main(String[] args) {

        Student[] students = {
            new Student("Ravi", 85, "Delhi"),
            new Student("Amit", 92, "Mumbai"),
            new Student("Neha", 78, "Pune"),
            new Student("Pooja", 92, "Delhi"),
            new Student("Suresh", 88, "Chennai")
        };

        System.out.println("Before Sorting");
        RankSorter.display(students);

        RankSorter.mergeSort(students, 0, students.length - 1);

        System.out.println("\nState Level Rank List");
        RankSorter.display(students);
    }
}
