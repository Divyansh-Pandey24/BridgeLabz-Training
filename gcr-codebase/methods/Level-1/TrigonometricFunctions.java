import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();

        // Calling the method
        double[] result = calculateTrigonometricFunctions(angle);

        // Displaying the result
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
}
