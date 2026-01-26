package com.annotation.importantmethod;
import java.lang.reflect.Method;

class Main {

    public static void main(String[] args) {

        Service service = new Service();
        Class<?> clazz = service.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod info = method.getAnnotation(ImportantMethod.class);
                System.out.println(
                        method.getName() + " - Level: " + info.level()
                );
            }
        }
    }
}
