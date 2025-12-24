import java.util.Scanner;

public class VowelsAndConsonants {

   // Method to check whether character is a consonant or vowel
    public static int[] check(String text) {
   
        int countVowels=0;
        int countConsonants=0;
        for (int i=0; i<text.length(); i++) {
             char ch= text.charAt(i);
             if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                 countVowels++;
             } else {
                 countConsonants++;
             }
        }
        return new int[]{countVowels,countConsonants};
    }
    
    public static void main(String[] args) {
 
        //Take input from the users
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text= sc.nextLine();
        
        // Calling methods
        int[] result= check(text.toLowerCase());
  
        // Displaying the results
        System.out.println("The number of vowels are: "+ result[0]);
        System.out.println("The number of consonants are: "+ result[1]);
    }
}