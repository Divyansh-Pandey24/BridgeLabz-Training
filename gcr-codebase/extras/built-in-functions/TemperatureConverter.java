import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Calling the methods to get the results 
        double fResult = celsiusToFahrenheit(celsius);
        double cResult = fahrenheitToCelsius(fahrenheit);

        // Displaying the results
        System.out.println("Celsius to Fahrenheit: " + fResult);
        System.out.println("Fahrenheit to Celsius: " + cResult);

        sc.close();
    }
}
