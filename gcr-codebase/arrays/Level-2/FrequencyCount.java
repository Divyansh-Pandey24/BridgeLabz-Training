import java.util.Scanner;

public class FrequencyCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for a number
        int number = sc.nextInt();

        int temp = number;

        // Find the count of digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Create array to store digits
        int[] digits = new int[count];

        // Store digits of the number in array
        temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Create frequency array of size 10
        int[] frequency = new int[10];

        // Find frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }
    }
}
