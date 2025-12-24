import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random guess
    public static int generateGuess(int min, int max) {
        int guess = min + (int)(Math.random() * (max - min + 1));
        return guess;
    }

    // Method to get user feedback
    public static String getUserFeedback(Scanner sc) {
        System.out.print("Enter feedback (High / Low / Correct): ");
        String feedback = sc.next();
        return feedback;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 100;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100");

        while (guessed == false) {

            int computerGuess = generateGuess(min, max);
            System.out.println("Computer guessed: " + computerGuess);

            String feedback = getUserFeedback(sc);

            if (feedback.equalsIgnoreCase("High")) {
                max = computerGuess - 1;
            }
            else if (feedback.equalsIgnoreCase("Low")) {
                min = computerGuess + 1;
            }
            else if (feedback.equalsIgnoreCase("Correct")) {
                System.out.println("Computer guessed the number correctly!");
                guessed = true;
            }
        }

        sc.close();
    }
}
