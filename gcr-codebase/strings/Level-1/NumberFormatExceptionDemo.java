import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        Integer.parseInt(text);

    }

    // Method to handle NumberFormatException and RuntimeException
    public static void handleNumberFormatException(String text) {
     

        try {
            Integer.parseInt(text);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException is handled");
            System.out.println(e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException is handled");
            System.out.println(e.getMessage());
        }

        System.out.println("The program is running");
    }

    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        String text = sc.next();


        try {
            // Calling to generate the exception
            generateNumberFormatException(text);

        } catch (IllegalArgumentException e) {
            // Calling to handle the exception
            handleNumberFormatException(text);
        }

        sc.close();
    }
}
