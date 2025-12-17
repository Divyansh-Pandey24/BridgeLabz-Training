// Writing a code to calculate maximum number of handshakes
// Create MaximumHandshakes class to calculate maximum number of handshakes

import java.util.Scanner;

public class MaximumHandshakes{
 public static void main(String[] args){

  // Take number of students as input
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of students : ");
  int numberOfStudents = input.nextInt();

  // Calculate maximum handshakes 
  int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

  // Displaying the result
  System.out.println("The maximum number of possible handshakes among " +
                     numberOfStudents + " students is " + handshakes);

  input.close();
 }
}
