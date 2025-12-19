import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        // Take input from user and create a string array
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String[] result = new String[number + 1];

        // Logic to save Fizz, Buzz, FizzBuzz or number
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        // Displaying the results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
        sc.close();
    }
}
