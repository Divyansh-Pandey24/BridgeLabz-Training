import java.util.Scanner;
class PowerCalculation
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the base value");
   double base = sc.nextDouble();
   System.out.println("Enter the exponent value");
   double exponent = sc.nextDouble();

   double result = Math.pow(base, exponent);
   System.out.println("The result is: " + result);
 }
}
