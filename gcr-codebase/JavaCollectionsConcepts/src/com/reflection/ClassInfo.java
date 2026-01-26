package com.reflection;
import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) {
        String className = "java.util.ArrayList";

        try {
            Class<?> cls = Class.forName(className);
            System.out.println("\nClass: " + cls.getName() + "\n");
            System.out.println("Constructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println("  " + c);
            }
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println("  " + f);
            }
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println("  " + m);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}