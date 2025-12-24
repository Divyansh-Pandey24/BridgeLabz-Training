import java.util.Scanner;

public class MaximumOfThreeNumbers {

    // Method to take input of three numbers
    public static int[] takeInput() {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();
        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();

        return numbers;
    }

    // Method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        int[] values = takeInput();

        int maximum = findMaximum(values[0], values[1], values[2]);

        System.out.println("Maximum of the three numbers is: " + maximum);
    }
}
