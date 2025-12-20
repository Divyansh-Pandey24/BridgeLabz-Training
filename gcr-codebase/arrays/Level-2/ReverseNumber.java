import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = number;
        int index = 0;

        // Store digits
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Displaying digits in reverse order
        for (int i = 0; i< digits.length; i++) {
            System.out.print(digits[i]);
        }
        sc.close();
    }
}
