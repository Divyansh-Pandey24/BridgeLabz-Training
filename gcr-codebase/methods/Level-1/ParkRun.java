import java.util.Scanner;

public class ParkRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;   
        double totalDistance = 5000;                 
        return (totalDistance + (perimeter - 1)) / perimeter;
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        // Calling the method
        double rounds = calculateRounds(side1, side2, side3);

        // Displaying the result
        System.out.println("The number of rounds are: "+(int)rounds);
    }
}
