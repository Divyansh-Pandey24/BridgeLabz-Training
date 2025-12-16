import java.util.Scanner;
class VolumeOfCylinder
{
   public static void main(String []args)
{
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius of a cylinder");
  double radius=sc.nextDouble();
    System.out.println("Enter height of a cylinder");
  double height=sc.nextDouble();
 double volumeOfCylinder= (Math.PI)*(Math.pow(radius,2))*(height);
    System.out.println("The volume of a cylinder is :" + volumeOfCylinder);
  }
}