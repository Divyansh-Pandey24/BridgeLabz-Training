package com.day04.fittracker;
import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Fitness Goal (optional or press Enter): ");
        String goal = sc.nextLine();

        UserProfile user;

        if (goal.trim().isEmpty()) {
            user = new UserProfile(name, age, weight);
        } else {
            user = new UserProfile(name, age, weight, goal);
        }

        System.out.println("\nChoose Workout Type:");
        System.out.println("1. Cardio");
        System.out.println("2. Strength");
        int choice = sc.nextInt();

        System.out.println("Enter Duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;

        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        workout.startWorkout();
        workout.calculateCalories();
        workout.stopWorkout();

        double dailyTarget = 500;   // Example
        double progress = dailyTarget - workout.getCaloriesBurned();

        System.out.println("\n---- FITNESS SUMMARY ----");
        System.out.println("User: " + user.getName());
        System.out.println("Goal: " + user.getGoal());
        System.out.println("Calories Burned: " + workout.getCaloriesBurned());
        System.out.println("Remaining Target: " + progress);

        sc.close();
    }
}
