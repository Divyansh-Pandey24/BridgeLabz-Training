import java.util.Scanner;

public class ComparisonOfCharArray {

    // Method to generate array of characters
    public static char[] generateCharArray(String str) {
        char[] characterArray= new char[str.length()];

        for (int i=0; i<characterArray.length; i++) {
             characterArray[i]= str.charAt(i);
        }
        return characterArray;
    }
    
    // Method to compare both the character arrays
    public static boolean compare(char[] charArray1, char[] charArray2) {

        if (charArray1.length != charArray2.length) {
           return false;
        }

        for (int i=0; i<charArray1.length; i++) {
           if (charArray1[i] != charArray2[i]) {
             return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
   
        // Take input from the users 
        Scanner sc=new Scanner(System.in);
        String str1= sc.next();

        // get character array using in built method
        char[] charArray1= str1.toCharArray();

        // Calling methods
        char[] charArray2= generateCharArray(str1);

        boolean isEqual= compare(charArray1,charArray2);
     
        // Displaying the results
        if (isEqual) {
            System.out.println("Both the character arrays are equal");
        } else {
            System.out.println("Both the character arrays are not equal");
        }

    }
}