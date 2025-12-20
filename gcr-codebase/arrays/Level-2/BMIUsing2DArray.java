import java.util.Scanner;

public class BMIUsing2DArray {

    public static void main(String[] args) {

        // Take input for number of persons
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Create 2D array to store weight, height and BMI
        double[][] personData = new double[number][3];

        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            personData[i][0] = sc.nextDouble();

            personData[i][1] = sc.nextDouble();

            // Check for negative values
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.err.println("Invalid input, please enter positive values");
                i--;
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {

            // BMI calculation
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Finding weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying height, weight, BMI and status
        for (int i = 0; i < number; i++) {
             System.out.println("Person " + (i + 1) + ": Height is " + personData[i][1] + ", Weight is " + personData[i][0] + ", BMI is " + personData[i][2] + ", Status is " +weightStatus[i]);
        }

    }
}
