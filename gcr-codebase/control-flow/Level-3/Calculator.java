import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        double firstNumber= sc.nextDouble();
        double secondNumber= sc.nextDouble();
        String op = sc.next();

        double result = 0;
        boolean validOperation = true;

        // Using switch cases to find out the results
        switch (op) {
            case "+":
                result = firstNumber+secondNumber;
                break;
            case "-":
                result = firstNumber-secondNumber;
                break;
            case "*":
                result = firstNumber*secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid Operator!");
                validOperation = false;
                break;
        }

        // Displaying the results
        if (validOperation) {
           System.out.println(result);
        } 

        sc.close();
    }
}
