package com.reflection;
import java.lang.reflect.*;

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            Calculator calc = new Calculator();
            
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            
            multiplyMethod.setAccessible(true);
            
            Object result = multiplyMethod.invoke(calc, 6, 7);
            
            System.out.println("Result: " + result);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}