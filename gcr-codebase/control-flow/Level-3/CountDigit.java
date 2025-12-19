import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {

        //Take input from user
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();

        int count=0;

        // Logic to find out the number of digits in a number using while loop
        while (number != 0) {
               count+=1;
               number/=10;
        }
        // Displaying the results
        System.out.println("The number of digits are: "+count);
   
        sc.close();
    }
}