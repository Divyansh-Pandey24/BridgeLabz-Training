// Writing a code to check whether a person can vote
// Create CheckVoteOrNot class

import java.util.Scanner;

public class CheckVoteOrNot{
 public static void main(String[] args){

  // Take input from users
  Scanner input=new Scanner(System.in);
  System.out.print("Enter the age: ");
  int age= input.nextInt();
  
  // Logic to find out the eligibility of a person
  if(age>=18){
   System.out.println("The person's age is "+age+" and can vote.");
  }
  else{
   System.out.println("The person's age is "+age+" and cannot vote.");
  }


 }
}