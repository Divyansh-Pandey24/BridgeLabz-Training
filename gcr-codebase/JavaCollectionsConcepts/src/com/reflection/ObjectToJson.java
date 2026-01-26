package com.reflection;
import java.lang.reflect.*;
import java.util.*;

public class ObjectToJson {

    public static String toJson(Object obj) {
        if (obj == null) return "null";

        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = clazz.getDeclaredFields();
        List<String> fieldStrings = new ArrayList<>();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);
                String fieldJson = "\"" + field.getName() + "\": " + formatValue(value);
                fieldStrings.add(fieldJson);
            } catch (IllegalAccessException e) {
                fieldStrings.add("\"" + field.getName() + "\": \"<access denied>\"");
            }
        }

        json.append(String.join(", ", fieldStrings));
        json.append("}");
        return json.toString();
    }

    private static String formatValue(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof String || value instanceof Character) {
            return "\"" + value.toString().replace("\"", "\\\"") + "\"";
        }
        if (value instanceof Number || value instanceof Boolean) {
            return value.toString();
        }
        if (value instanceof Object[]) {
            return Arrays.toString((Object[]) value);
        }
        if (value.getClass().isArray()) {
            return arrayToString(value);
        }
        return "\"" + value.toString() + "\"";
    }

    private static String arrayToString(Object array) {
        int length = Array.getLength(array);
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            Object item = Array.get(array, i);
            sb.append(formatValue(item));
            if (i < length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Person person = new Person("Divyansh", 20, true);

        String json = toJson(person);
        System.out.println(json);
    }
}

class Person {
    private String name;
    private int age;
    private boolean active;

    public Person(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }
}