import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
    
        //Take input from user
        Scanner sc=new Scanner(System.in);
        double weight= sc.nextDouble();
        double height= sc.nextDouble();

        // Converting the height in cm into meter
        height/=100;
       
        //Logic to find out the bmi of a person using BMI formula
        double bmi= weight / (height * height);
  
        // Displaying the results
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi>= 18.5 && bmi<= 24.9) {
            System.out.println("Normal");
        } else if (bmi>= 25.0 && bmi<= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        sc.close();
    }
}