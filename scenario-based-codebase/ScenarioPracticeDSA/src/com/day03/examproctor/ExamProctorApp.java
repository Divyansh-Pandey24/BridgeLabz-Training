package com.day03.examproctor;

import java.util.Scanner;

public class ExamProctorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamProctor exam = new ExamProctor();

        while (true) {
            System.out.println("\n--- Online Exam ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Answer Question");
            System.out.println("3. Go to Last Visited Question");
            System.out.println("4. Submit Exam");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            if (choice == 0) break;

            switch (choice) {

                case 1:
                    System.out.print("Enter Question ID (1-5): ");
                    int q = sc.nextInt();
                    exam.visitQuestion(q);
                    break;

                case 2:
                    System.out.print("Enter Question ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Answer (A/B/C/D): ");
                    String ans = sc.next();
                    exam.answerQuestion(id, ans);
                    break;

                case 3:
                    if (!exam.navigation.isEmpty())
                        System.out.println("Last visited question: " + exam.navigation.peek());
                    else
                        System.out.println("No navigation history.");
                    break;

                case 4:
                    int score = exam.calculateScore();
                    System.out.println("Exam submitted.");
                    System.out.println("Your Score = " + score + " / 5");
                    return;
            }
        }
        sc.close();
    }
}
