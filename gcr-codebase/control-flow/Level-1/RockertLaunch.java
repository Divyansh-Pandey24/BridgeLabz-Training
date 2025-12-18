// Writing a code to count down the value for rocket launch
// Create RocketLaunch class

import java.util.Scanner;

public class RockertLaunch {
    
     public static void main(String[] args) {
     
     // Take input from the user
     Scanner input=new Scanner(System.in);
     System.out.print("Enter the counter value: ");
     int counter= input.nextInt();
     
     // Logic section for the rocket to launch using while loop and displaying the result
     while(counter>=1){
       System.out.println(counter);
      
     // Decreasing the value of counter by 1
       counter=counter-1;
     }

    
     }
}