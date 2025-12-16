import java.util.Scanner;
class PerimeterOfRectangle
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the length of the rectangle");
   double length = sc.nextDouble();
   System.out.println("Enter the width of the rectangle");
   double width = sc.nextDouble();

   double perimeter = 2 * (length + width);
   System.out.println("The perimeter of the rectangle is: " + perimeter);
 }
}
