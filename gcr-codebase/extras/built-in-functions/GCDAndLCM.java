import java.util.Scanner;

public class GCDAndLCM {

    // Method to calculate GCD
    public static int findGCD(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    // Method to calculate LCM
    public static int findLCM(int a, int b) {

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        return lcm;
    }

    // Method to take input
    public static int[] takeInput() {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        return numbers;
    }

    public static void main(String[] args) {

        int[] values = takeInput();

        // Calling the methods to get the lcm and gcd
        int gcd = findGCD(values[0], values[1]);
        int lcm = findLCM(values[0], values[1]);
        
        // Displaying the results
        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);
    }
}
