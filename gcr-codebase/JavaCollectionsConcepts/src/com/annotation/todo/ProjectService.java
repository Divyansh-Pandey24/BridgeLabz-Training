package com.annotation.todo;
class ProjectService {

    @Todo(task = "Implement login feature", assignedTo = "Divyansh", priority = "HIGH")
    void login() {
    }

    @Todo(task = "Add payment gateway", assignedTo = "Aman")
    void payment() {
    }

    @Todo(task = "Optimize database queries", assignedTo = "Riya", priority = "LOW")
    void optimize() {
    }
}
