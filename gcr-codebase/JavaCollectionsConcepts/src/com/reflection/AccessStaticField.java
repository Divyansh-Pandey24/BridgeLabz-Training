package com.reflection;
import java.lang.reflect.*;

public class AccessStaticField {
    public static void main(String[] args) {
        try {
            Class<?> cls = Configuration.class;
            
            Field apiKeyField = cls.getDeclaredField("API_KEY");
            
            apiKeyField.setAccessible(true);
            
            apiKeyField.set(null, "NEW_SECRET_KEY_12345");
            
            String value = (String) apiKeyField.get(null);
            
            System.out.println("Modified API_KEY: " + value);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Configuration {
    private static String API_KEY = "OLD_SECRET_KEY";
}