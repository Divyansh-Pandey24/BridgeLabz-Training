package com.annotation.bugreport;
class TaskService {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance problem")
    void processTask() {
        System.out.println("Processing task");
    }
}
