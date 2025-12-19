import java.util.Scanner;

public class CheckAges {

    public static void main(String[] args) {
    
        //Take input from user in an array
        Scanner sc=new Scanner(System.in);

        int[] ages= new int[10];
        for (int i=0; i< ages.length; i++) {
             ages[i]= sc.nextInt();
        }
        
        // Logic to check whether the person is eligible or not and displaying the results
        for (int i=0; i< ages.length; i++) {
             if (ages[i] < 0) {
                 System.out.println("Invalid age");
                 
             } else {
                if (ages[i] >= 18) {
                    System.out.println("The person with the age "+ages[0]+" can vote");
                } else {
                    System.out.println("The person with the age "+ages[0]+" cannot vote");
                }
             }
        }
        sc.close();

    }
}
