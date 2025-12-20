import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        // Take input for number of persons
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create arrays to store weight, height, BMI, and status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextDouble();

            height[i] = sc.nextDouble();
        }

        // Calculate BMI using formula and determine weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]); 

            // Determine weight status
            if (bmi[i] < 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25.0 && bmi[i] < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying height, weight, BMI, and status
        for (int i = 0; i < n; i++) {
        System.out.println("Person " + (i + 1) + ": Height is " + height[i] + " Weight is " + weight[i] + " BMI is " + bmi[i] + ", Status is " + status[i]);
        }

    }
}
