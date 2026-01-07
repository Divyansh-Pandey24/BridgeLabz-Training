package com.day04.edumentor;
import java.util.Scanner;

public class EduMentorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Learner Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Learner Email: ");
        String email = sc.nextLine();

        System.out.println("Enter Learner User ID: ");
        String userId = sc.nextLine();

        System.out.println("Is this a Full-Time Course? (true/false): ");
        boolean isFullTime = sc.nextBoolean();
        sc.nextLine();   // consume extra newline

        Learner learner = new Learner(name, email, userId, isFullTime);

        // ---------- QUIZ SETUP ----------
        String[] questions = {
            "2 + 2 = ?",
            "Java is Object Oriented? (Yes/No)",
            "Is Earth flat? (Yes/No)"
        };

        String[] correctAnswers = {"4", "Yes", "No"};

        Quiz quiz = new Quiz(questions, correctAnswers, "Beginner");

        String[] userAnswers = new String[questions.length];

        System.out.println("\n----- QUIZ START -----");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            userAnswers[i] = sc.nextLine();
        }

        quiz.evaluate(userAnswers);

        System.out.println("\n----- RESULT -----");
        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.getPercentage());

        System.out.println("\n----- CERTIFICATE -----");
        System.out.println(learner.generateCertificate());

        sc.close();
    }
}
