package com.reflection;
import java.lang.reflect.*;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("Student");
            
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
            
            Object student = constructor.newInstance("Divyansh", 20);
            
            System.out.println("Student created dynamically:");
            System.out.println(student);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}