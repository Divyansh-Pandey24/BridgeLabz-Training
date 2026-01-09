package com.day07.skillforge;
import java.util.Scanner;

public class SkillForgeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to SkillForge");

        System.out.print("Enter Instructor Name: ");
        String instName = sc.nextLine();

        System.out.print("Enter Instructor Email: ");
        String instEmail = sc.nextLine();

        Instructor instructor = new Instructor(instName, instEmail);

        System.out.print("Enter Course Title: ");
        String courseTitle = sc.nextLine();

        System.out.print("Enter Number of Modules: ");
        int moduleCount = sc.nextInt();
        sc.nextLine();

        String[] modules = new String[moduleCount];

        for (int i = 0; i < moduleCount; i++) {
            System.out.print("Enter Module " + (i + 1) + ": ");
            modules[i] = sc.nextLine();
        }

        System.out.println("Choose Course Level");
        System.out.println("1 Beginner");
        System.out.println("2 Advanced");
        int level = sc.nextInt();
        sc.nextLine();

        Course course;
        if (level == 1) {
            course = new BeginnerCourse(courseTitle, instructor, modules);
        } else {
            course = new AdvancedCourse(courseTitle, instructor, modules);
        }

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student Email: ");
        String studentEmail = sc.nextLine();

        Student student = new Student(studentName, studentEmail, moduleCount);

        for (int i = 0; i < moduleCount; i++) {
            System.out.print("Has the student completed module " + (i + 1) + " Enter 1 for yes 0 for no: ");
            int done = sc.nextInt();
            if (done == 1) {
                student.completeModule();
            }
        }

        System.out.print("Enter Student Score: ");
        double score = sc.nextDouble();
        student.setScore(score);

        System.out.println("Student Progress: " + student.getProgress() + " percent");

        System.out.println();
        System.out.println(course.generateCertificate(student));

        sc.close();
    }
}
