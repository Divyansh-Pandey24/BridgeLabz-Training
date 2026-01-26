package com.annotation.logexecutiontime;
import java.lang.reflect.Method;

class Main {

    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();
        Class<?> clazz = service.getClass();

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                method.invoke(service);
                long end = System.nanoTime();

                System.out.println(
                        method.getName() + " executed in " + (end - start) + " ns"
                );
            }
        }
    }
}
