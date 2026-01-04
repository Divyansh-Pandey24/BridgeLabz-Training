package com.linkedlists.circularlinkedlist.taskschedular;

public class TaskNode {

    int taskId;
    String taskName;
    String priority;
    String dueDate;

    TaskNode next;

    public TaskNode(int taskId, String taskName, String priority, String dueDate){
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
