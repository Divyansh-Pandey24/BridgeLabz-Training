package com.reflection;
import java.lang.reflect.*;
import java.util.Map;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object value = entry.getValue();

                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);

                    field.set(instance, value);

                } catch (NoSuchFieldException e) {
                    System.out.println("Field not found: " + fieldName);
                } catch (IllegalArgumentException e) {
                    System.out.println("Type mismatch for field: " + fieldName);
                }
            }

            return instance;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Map<String, Object> data = Map.of(
            "name", "Divyansh",
            "age", 20,
            "email", "divyansh@example.com"
        );

        Person person = toObject(Person.class, data);

        System.out.println(person);
    }
}

class Person {
    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}