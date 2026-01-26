package com.annotation.customtaskinfo;
class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Divyansh")
    void completeTask() {
        System.out.println("Task completed");
    }
}
