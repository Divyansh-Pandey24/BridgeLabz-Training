// Writing a code to count down the value for rocket launch
// Create Countdown class

import java.util.Scanner;

public class Countdown {
    
     public static void main(String[] args) {
     
     // Take input from the user
     Scanner input=new Scanner(System.in);
     System.out.print("Enter the counter value: ");
     int counter= input.nextInt();
     
     // Logic section for the rocket to launch using while loop and displaying the result
     for(int i=counter; i>=1; i--) {
         System.out.println(i);
     }
     
    
     }
}