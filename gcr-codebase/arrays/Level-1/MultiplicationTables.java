import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {

        // Take input from user and creating an array
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];

        int index = 0;

        // Logic to find multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Displaying the results
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
        sc.close();
    }
}
