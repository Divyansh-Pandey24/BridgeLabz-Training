package com.reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "Divyansh Sharma")
class MyBook {
    public void read() {
        System.out.println("Reading the book...");
    }
}

public class RetrieveAnnotation {
    public static void main(String[] args) {
        Class<?> cls = MyBook.class;
        
        Annotation annotation = cls.getAnnotation(Author.class);
        
        if (annotation != null) {
            Author author = (Author) annotation;
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No Author annotation found");
        }
    }
}