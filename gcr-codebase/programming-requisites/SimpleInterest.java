import java.util.Scanner;
class SimpleInterest
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the principal amount");
   double principal = sc.nextDouble();
   System.out.println("Enter the rate of interest");
   double rate = sc.nextDouble();
   System.out.println("Enter the time");
   double time = sc.nextDouble();

   double simpleInterest = (principal * rate * time) / 100;
   System.out.println("The simple interest is: " + simpleInterest);
 }
}
