/*
17. Online Quiz Application 
Ask 5 questions (MCQs) from a user.
 Use arrays and for-loop.
 Record score.
 Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("=======================================================\n");
        System.out.print("\n------WELCOME TO QUIZ APPLICATION-------\n");
        System.out.print("\n=======================================================\n");

        // Create array to store questions
        String[] questions = {"Q1. What is the capital of India ?",
                              "Q2. Which team won the 2024 T20 men's World Cup ?",
                              "Q3. Who is the prime minister of India ?",
                              "Q4. What is the capital of Madhya Pradesh ?",
                              "Q5. Who is known as the missile man of India ?"};
        
        // Create array to store the options
        String[][] options={
                           {"a. New Delhi", "b. Bhopal", "c. Raipur", "d. Chennai"},
                           {"a. Australia", "b. India", "c. England", "d. New Zeland"}, 
                           {"a. Amit Shah", "b. Rahul Gandhi", "c. Narendra Modi", "d. Sonia Gandhi"},
                           {"a. New Delhi", "b. Bhopal", "c. Raipur", "d.Chennai"},
                           {"a. Amit Shah", "b. Narendra Modi", "c. Manmohan Singh", "d. APJ Abdul Kalam"}
                           };

        // Create array to store the answers of questions
        char[] answer = {'a', 'b', 'c', 'b', 'd'};
        int correctAnswer = 0;
        for(int i=0; i<5; i++) {

           System.out.println(questions[i]);

                for(int j=0; j < options[i].length; j++) {
                  System.out.println(options[i][j]);
                }
                 
            System.out.print("Enter the option: ");

            char choice;
            
            // use do while to take the correct input
            do {
             choice = sc.next().charAt(0);
             if(choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd') {
               System.out.println("Invalid input! Enter again: ");
             }
             else {
               break;
             }
            } while(true);

            // Use switch to validate the answers
            switch(choice) {
                case 'a' ->{
                   if(answer[i] == 'a') {
                      System.out.println("The answer is correct");
                      correctAnswer++;
                   }
                   else {
                      System.out.println("The answer is wrong");
                   }
                }
                case 'b' ->{
                   if(answer[i] == 'b') {
                      System.out.println("The answer is correct");
                      correctAnswer++;
                   }
                   else {
                      System.out.println("The answer is wrong");
                   }

                }
                case 'c' ->{
                   if(answer[i] == 'c') {
                      System.out.println("The answer is correct");
                      correctAnswer++;
                   }
                   else {
                      System.out.println("The answer is wrong");
                   }

                }
                case 'd' ->{
                   if(answer[i] == 'd') {
                      System.out.println("The answer is correct");
                      correctAnswer++;
                   }
                   else {
                      System.out.println("The answer is wrong");
                   }

                }

            }
        }
        
        // Displaying the results
        System.out.print("=======================================================\n");
        System.out.print("The number of correct answers are: "+ correctAnswer);
        System.out.print("\n=======================================================\n");

        sc.close();
    }
}


        
