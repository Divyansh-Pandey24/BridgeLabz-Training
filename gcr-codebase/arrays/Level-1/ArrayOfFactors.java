import java.util.Scanner;

public class ArrayOfFactors {

    public static void main(String[] args) {

        // Take input from user and create an array
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Logic to find factors and store them in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                // Checking whether the array is full or not
                if (index == maxFactor) {

                    // Increase the size of array
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    // Copy old values to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store factor in array
                factors[index] = i;
                index++;
            }
        }

        // Displaying the factors
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
