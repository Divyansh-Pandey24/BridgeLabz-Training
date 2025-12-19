import java.util.Scanner;

public class SumOfValues {

    public static void main(String[] args) {
    
        //Take input from user in an array based on the condition
        Scanner sc=new Scanner(System.in);

        double[] numbers= new double[10];

        // Create a variable to store the result
        double total= 0.0;
        int index= 0;

        while (true) {
               number[index]= sc.nextDouble();
               if (number[index]==0 || number[index] < 0 || i==10) {
                   break;
               }
               index++;
        }
 
        // Logic to find out the sum
        for (int i=0; i< numbers.length; i++) {
              total+=numbers[i];
        }
        
        // Displaying the results
        System.out.println(total);

    }
}
