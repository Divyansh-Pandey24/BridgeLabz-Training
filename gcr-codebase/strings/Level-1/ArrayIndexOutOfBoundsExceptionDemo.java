import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] array) {
        String s = array[array.length];
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] array) {

        try {
            String s = array[array.length];


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is handled");
            System.out.println(e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException is handled");
            System.out.println(e.getMessage());
        }

        System.out.println("The program is running");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size
        int number = sc.nextInt();
        String[] array = new String[number];

        // Taking array elements
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }

        try {
            generateArrayIndexOutOfBoundsException(array);

        } catch (ArrayIndexOutOfBoundsException e) {
            handleArrayIndexOutOfBoundsException(array);
        }

        sc.close();
    }
}
