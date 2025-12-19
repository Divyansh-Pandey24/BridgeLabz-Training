import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
    
        //Take input from user
        Scanner sc=new Scanner(System.in);

        int number= sc.nextInt();
        int[] table= new int[10];
        for (int i=1; i<= table.length; i++) {
             table[i-1]= number * i;
        }

        // Displaying the results
        for (int i=1; i<= table.length; i++) {
             System.out.println(number+" * "+i+" = "+table[i-1]);
        }


    }
}
