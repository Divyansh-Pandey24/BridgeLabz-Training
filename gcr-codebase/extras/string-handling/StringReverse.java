import java.util.Scanner;

public class StringReverse {

    // Method to get reverse of a string
    public static String getReverseString(String text) {

        String res= "";

        for (int i=text.length()-1 ; i>=0 ; i--) {
             char ch= text.charAt(i);
             res+=ch;
        }
        return res;

    }
    public static void main(String[] args) {
     
        // Take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text= sc.next();

        // Calling methods to get the results
        String reversedString= getReverseString(text);
 
        // Displaying the result
        System.out.println("The reversed string is: "+reversedString);
    }
}