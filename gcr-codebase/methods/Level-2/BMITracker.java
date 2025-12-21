import java.util.Scanner;

public class BMITracker {

    // Method to calculate BMI 
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];      
            double heightCm = data[i][1];    

            double heightMeters = heightCm / 100;

            double bmi = weight / (heightMeters * heightMeters);

            data[i][2] = bmi; 
        }
    }

    // Method to check BMI status 
    public static String[] checkBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < data.length; i++) {
            data[i][0] = sc.nextDouble(); 
            data[i][1] = sc.nextDouble(); 
        }

        // Calling method Calculate BMI
        calculateBMI(data);

        // Calling method to get the status
        String[] status = checkBMIStatus(data);

        // Display results
        System.out.println("Weight  Height(cm)  BMI  Status");
        for (int i = 0; i < data.length; i++) {
            System.out.println(
                data[i][0] + "    " +
                data[i][1] + "       " +
                data[i][2] + "    " +
                status[i]
            );
        }

    }
}
