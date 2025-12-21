import java.util.Scanner;
import java.util.Arrays;

class FactorOfNumber {

    // Method to find factors and return as array
    public static int[] findFactors(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];

        // Second loop: store factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find greatest factor
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
}

public class FactorCheckerMain {

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = FactorOfNumber.findFactors(number);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest factor: " + FactorOfNumber.greatestFactor(factors));
        System.out.println("Sum of factors: " + FactorOfNumber.sumOfFactors(factors));
        System.out.println("Product of factors: " + FactorOfNumber.productOfFactors(factors));
        System.out.println("Product of cubes of factors: " +
                FactorOfNumber.productOfCubes(factors));

        sc.close();
    }
}
