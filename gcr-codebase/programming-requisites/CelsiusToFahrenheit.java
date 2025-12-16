import java.util.Scanner;
class CelsiusToFahrenheit
{
  public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter Temperature in Celsius");
     double tempInCelsius=sc.nextDouble();
     double tempInFahrenheit= ((tempInCelsius) * 9/5)+32;
     System.out.println("Temperature in Fahrenheit is:"+ tempInFahrenheit);
    
}
}
