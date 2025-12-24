import java.util.Scanner;

public class FibonacciSequence {

    // Method to generate and print Fibonacci sequence
    public static void printFibonacci(int terms) {

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    // Method to take input
    public static int takeInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        return n;
    }

    public static void main(String[] args) {

        int terms = takeInput();

        printFibonacci(terms);
    }
}
