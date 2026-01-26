package com.reflection;
import java.lang.reflect.*;

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            Person p = new Person();
            
            Class<?> cls = p.getClass();
            
            Field ageField = cls.getDeclaredField("age");
            
            ageField.setAccessible(true);
            
            ageField.set(p, 25);
            
            int value = ageField.getInt(p);
            
            System.out.println("Modified age: " + value);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private int age = 18;
}