import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find out the largest and smallest
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int[] results= new int[2];

        if((num1 > num2) && (num1 > num3)) {
           results[0]= num1;
        } else if ((num2 > num1) && (num2 > num3)) {
           results[0]= num2;
        } else {
           results[0]= num3;
        }

        if((num1 < num2) && (num1 < num3)) {
           results[1]= num1;
        } else if ((num2 < num1) && (num2 < num3)) {
           results[1]= num2;
        } else {
           results[1]= num3;
        }

        return results;
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();

        // Calling the method
        int[] results= findSmallestAndLargest(num1, num2, num3);

        // Displaying the results
        System.out.println("The largest number is: "+results[0]+" .The smallest number is: "+results[1]);
    }
}