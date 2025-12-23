import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
       
            text.charAt(text.length());
        
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
        
        try {
            text.charAt(text.length());

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("The exception is being handled");

            System.out.println(e.getMessage());

            System.out.println("The programming is running");
        }
    }
  
    public static void main(String[] args) {

        // Take input from users
        Scanner sc=new Scanner(System.in);
        String text= sc.next();
 
        try {
          // Calling to generate the StringIndexOutOfBoundsException
            generateStringIndexOutOfBoundsException(text);

        } catch (StringIndexOutOfBoundsException e) {
          // Calling to handle StringIndexOutOfBoundsException
            handleStringIndexOutOfBoundsException(text);
        }
        
    }
}