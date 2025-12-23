public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text= null;
        text.length();
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text= null;

        try {
            text.length();

        } catch (NullPointerException e) {

            System.out.println("The exception is being handled");

            System.out.println(e.getMessage());

            System.out.println("The programming is running");
        }
    }
  
    public static void main(String[] args) {

        try {
          // Calling to generate the NullPointerException
            generateNullPointerException();

        } catch (NullPointerException e) {
          // Calling to handle NullPointerException
            handleNullPointerException();
        }
        
    }
}