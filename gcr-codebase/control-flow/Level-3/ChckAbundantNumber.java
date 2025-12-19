import java.util.Scanner;

public class ChckAbundantNumber {

    public static void main(String[] args) {

        // Take input from users
        Scanner sc = new Scanner(System.in);
        int number = scanner.nextInt();
        
        // Create an integer variable sum with initial value 0
        int sum = 0;
        
        //Logic to find out the sum of the divisor
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Displaying the results
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
        
        sc.close();
    }
}
