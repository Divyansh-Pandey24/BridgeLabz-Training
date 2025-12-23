import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
        int startIndex= text.length()-1;
        int endIndex= 0;

        text.substring(text.length()-1, 0);
    }

    // Method to handle IllegalArgumentException and RuntimeException
    public static void handleIllegalArgumentException(String text) {
     
        int startIndex= text.length()-1;
        int endIndex= 0;

        try {
            text.substring(startIndex, endIndex);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException is handled");
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
            generateIllegalArgumentException(text);

        } catch (IllegalArgumentException e) {
            // Calling to handle the exception
            handleIllegalArgumentException(text);
        }

        sc.close();
    }
}
