import java.util.Scanner;

public class BMICalculation {

    // Method to calculate BMI and status for one person
    public static String[] calculateBMIAndStatus(double weightKg, double heightCm) {

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;
        // BMI formula
        double bmi = weightKg / (heightMeter * heightMeter);
        // Round BMI to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        // BMI status logic
        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        // Return BMI and status as String array
        return new String[] { String.valueOf(bmi), status };
    }

    // Method to compute BMI details for all persons
    public static String[][] computeBMIDetails(double[][] data) {

        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMIAndStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }

        return result;
    }

    // Method to display BMI table
    public static void displayBMI(String[][] bmiData) {

        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.println(
                    bmiData[i][0] + "\t\t" +
                    bmiData[i][1] + "\t\t" +
                    bmiData[i][2] + "\t" +
                    bmiData[i][3]
            );
        }
    }

    public static void main(String[] args) {

        // Take inputs from the users
        Scanner sc = new Scanner(System.in);
        double[][] inputData = new double[10][2];

        // Take input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            inputData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            inputData[i][1] = sc.nextDouble();
        }

        // Compute BMI details
        String[][] bmiResult = computeBMIDetails(inputData);

        // Displaying the results
        displayBMI(bmiResult);

        sc.close();
    }
}
