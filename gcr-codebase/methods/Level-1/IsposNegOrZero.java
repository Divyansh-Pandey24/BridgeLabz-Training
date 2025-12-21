import java.util.Scanner;

public class IsposNegOrZero {

    // Method to check the number
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Calling the method
        int result = checkNumber(number);

        // Displaying the result
        System.out.println(result);
    }
}
