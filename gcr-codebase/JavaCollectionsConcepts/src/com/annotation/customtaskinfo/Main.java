package com.annotation.customtaskinfo;
import java.lang.reflect.Method;

class Main {

    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();
        Method method = manager.getClass().getDeclaredMethod("completeTask");

        TaskInfo info = method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: " + info.priority());
        System.out.println("Assigned To: " + info.assignedTo());
    }
}
