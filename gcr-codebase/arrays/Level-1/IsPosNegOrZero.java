import java.util.Scanner;

public class IsPosNegOrZero {

    public static void main(String[] args) {
    
        //Take input from user in an array
        Scanner sc=new Scanner(System.in);

        int[] numbers= new int[5];
        for (int i=0; i< numbers.length; i++) {
             numbers[i]= sc.nextInt();
        }

        for (int i=0; i< numbers.length; i++) {
             if (numbers[i] > 0) {
                 if (numbers[i]%2 == 0) {
                     System.out.println("Positive even number");
                 } else {
                     System.out.println("Positive odd number");
                 }
             } else if (numbers[i] < 0) {
                     System.out.println("Negative number");
             } else {
                     System.out.println("zero");
             }
        }

        sc.close();
    }
}
