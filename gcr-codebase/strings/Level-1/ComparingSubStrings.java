import java.util.Scanner;

public class ComparingSubStrings {

    // Method to get the substring
    public static String getSubString(String str1, int startIndex, int endIndex) {
        String resultString="";
        for (int i=startIndex; i<endIndex ; i++) {
             resultString+= str1.charAt(i);
        }
        return resultString;
        
    }
   
    // Method to compare both the strings
    public static boolean compare(String str2, String str3, int startIndex, int endIndex) {

        if (str2.length() != str3.length()) {
            return false;
        }
        for (int i=startIndex; i<endIndex; i++) {
             if (str2.charAt(i)!=str3.charAt(i)) {
                 return false;
             }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        // Take input from the users
        Scanner sc=new Scanner(System.in);
        String str1= sc.next();
        int startIndex= sc.nextInt();
        int endIndex= sc.nextInt();

        // get substring using in built method
        String str2= str1.substring(startIndex, endIndex);


        // Calling methods to get the substring
        String str3= getSubString(str1, startIndex, endIndex);

        boolean isEqual= compare(str2, str3, startIndex, endIndex);

        // Displaying the results
        if (isEqual) {
            System.out.println("Both the substrings are equal");
        } else {
            System.out.println("Both the substrings are not equal");
        }
        sc.close();
    }
}