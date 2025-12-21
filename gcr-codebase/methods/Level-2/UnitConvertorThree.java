import java.util.Scanner;

public class UnitConvertorThree {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        double farhenheit = sc.nextDouble();
        double celsius = sc.nextDouble();
        double pounds = sc.nextDouble();
        double kilograms = sc.nextDouble();
        double gallons = sc.nextDouble();
        double liters = sc.nextDouble();

        // Displaying results
        System.out.println(convertFarhenheitToCelsius(farhenheit));
        System.out.println(convertCelsiusToFarhenheit(celsius));
        System.out.println(convertPoundsToKilograms(pounds));
        System.out.println(convertKilogramsToPounds(kilograms));
        System.out.println(convertGallonsToLiters(gallons));
        System.out.println(convertLitersToGallons(liters));
    }
}
