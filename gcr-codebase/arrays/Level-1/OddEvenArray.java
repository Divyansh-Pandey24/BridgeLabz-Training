import java.util.Scanner;

public class OddEvenArray {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        // Create arrays for odd and even numbers
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        // Logic to store odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Printing odd numbers
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println();

        // Printing even numbers
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        sc.close();
    }
}
