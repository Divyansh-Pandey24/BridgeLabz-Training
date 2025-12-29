/*
7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/

import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random number between 1–100
    public static int generateNumber() {
        return (int)(Math.random() * 100) + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Total chances allowed
        int totalAttempts = 5;

        System.out.println("\n-------- Welcome to the Number Guessing Game --------");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("Maximum Attempts: " + totalAttempts);

        int generatedNumber = generateNumber();

        int guessedNumber = 0; // to store user guess

        do {

            System.out.print("\nGuess the number: ");
            guessedNumber = sc.nextInt();

            System.out.println("Remaining Attempts: " + (totalAttempts - 1));

            if (generatedNumber == guessedNumber) {
                System.out.println(" Hurrah! Your guess is correct!");
                break;
            }
            else if (guessedNumber > generatedNumber) {
                System.out.println("Too high");
            }
            // Guess is lower
            else {
                System.out.println("Too low");
            }

            // Reduce remaining attempts
            totalAttempts--;

        } while (totalAttempts > 0);

        // If the user fialed to guess the correct number 
        if (guessedNumber != generatedNumber) {
            System.out.println("\n You ran out of attempts!");
            System.out.println("The correct number was: " + generatedNumber);
        }

        sc.close();
    }
}
