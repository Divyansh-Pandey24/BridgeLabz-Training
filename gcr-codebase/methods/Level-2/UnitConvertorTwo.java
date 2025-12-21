import java.util.Scanner;

public class UnitConvertorTwo {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        double yards = sc.nextDouble();
        double feet = sc.nextDouble();
        double meters = sc.nextDouble();
        double inches = sc.nextDouble();

        // Displaying results
        System.out.println(convertYardsToFeet(yards));
        System.out.println(convertFeetToYards(feet));
        System.out.println(convertMetersToInches(meters));
        System.out.println(convertInchesToMeters(inches));
        System.out.println(convertInchesToCentimeters(inches));
    }
}
