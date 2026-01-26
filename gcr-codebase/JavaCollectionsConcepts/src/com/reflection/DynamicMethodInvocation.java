package com.reflection;
import java.lang.reflect.*;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations math = new MathOperations();

        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            Method method = MathOperations.class.getDeclaredMethod(methodName, int.class, int.class);

            Object result = method.invoke(math, a, b);

            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + methodName);
        } catch (Exception e) {
            System.out.println("Error invoking method");
        }

        sc.close();
    }
}

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}