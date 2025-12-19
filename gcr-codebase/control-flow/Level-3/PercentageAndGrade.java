// Writing a program to compute the percentage and grade
// Create PercentageAndGrade class

import java.util.Scanner;

public class PercentageAndGrade {
     
    public static void main(String[] args) {

        //Take input from users for their subject marks
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter physics marks: ");
        double phyMarks= sc.nextInt();
        System.out.println("Enter chemistry marks: ");
        double chemMarks= sc.nextInt();
        System.out.println("Enter math marks: ");
        double mathMarks= sc.nextInt();

        // Logic to find out the percentage of a student
        double percentage= (phyMarks + chemMarks + mathMarks) * 100/300;

        // Create variable to store remarks and grade
        String remarks;
        char grade;
        if(percentage >= 80) {
           remarks= "(Level 4, above agency-normalized standards)";
           grade= 'A';
        } else if (percentage >=70 && percentage <80) {
           remarks= "(Level 3, at agency-normalized standards)";
           grade= 'B';
        } else if (percentage >=60 && percentage <70) {
           remarks= "(Level 2, below, but approaching agency-normalized standards)";
           grade= 'C';
        } else if (percentage >=50 && percentage <60) {
           remarks= "(Level 1, well below agency-normalized standards)";
           grade= 'D';
        } else if (percentage >=40 && percentage <49) {
           remarks= "(Level 1, too below agency-normalized standards)";
           grade= 'E';
        } else {
           remarks= "(Remedial standards)";
           grade= 'R';
        }

        // Displaying the results
        System.out.println("The percentage is: "+percentage+"\nGrade: "+grade+"\nRemarks: "+remarks);

        sc.close();
    }
}