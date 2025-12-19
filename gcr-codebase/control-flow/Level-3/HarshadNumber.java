import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
    
        //Take input from user
        Scanner sc=new Scanner(System.in);
        int originalNumber= sc.nextInt();
      
        // Create a variable to store the sum and store the value of original number
        int sum= 0;
        int number= originalNumber;
        // Logic to find out the sum using while loop
        while (number !=0 ) {
               int digit= number % 10;
               sum+=digit;
               number/=10;
        }
        
        // Displaying the results
        if(originalNumber % sum == 0) {
           System.out.println("Yes, the number is harshad number");
        } else {
           System.out.println("No, the number is not harshad number");
        }

        sc.close(); 
    }
}
