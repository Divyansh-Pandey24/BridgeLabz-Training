package com.annotation.bugreport;
import java.lang.reflect.Method;

class Main {

    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();
        Method method = service.getClass().getDeclaredMethod("processTask");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println(report.description());
        }
    }
}
