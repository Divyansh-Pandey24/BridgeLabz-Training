import java.util.Scanner;

public class RemovalOfDuplicates {

    // Method to remove the duplicates
    public static String removeDuplicate(String text) {
        String res="";

        for (int i=0; i<text.length(); i++) {
             char ch= text.charAt(i);
             boolean isPresent= false;

            for (int j=0; j<res.length(); j++) {

                 if (res.charAt(j) == ch) {
                     isPresent= true;
                     break;
                 }

            }

             if (!isPresent) {
                res+=ch;
             }
        }
        
        return res;
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text= sc.next();

        // Calling the methods to get the result
        String modifiedString= removeDuplicate(text);

        // Displaying the results
        System.out.println("The modified string is: "+modifiedString);
    }
}