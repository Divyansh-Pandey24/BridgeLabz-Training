package com.linkedlists.circularlinkedlist.taskschedular;

public class TaskCircularList {

    TaskNode head = null;
    TaskNode tail = null;
    int size = 0;


    // ADD AT FIRST
    public boolean addTaskAtFirst(int id, String name, String priority, String dueDate){

        TaskNode node = new TaskNode(id, name, priority, dueDate);

        // Empty list
        if(head == null){
            head = tail = node;
            tail.next = head;   // circular link
        }
        else{
            node.next = head;
            head = node;
            tail.next = head;   // maintain circular
        }

        size++;
        return true;
    }


    // ADD AT LAST
    public boolean addTaskAtLast(int id, String name, String priority, String dueDate){

        if(head == null)
            return addTaskAtFirst(id, name, priority, dueDate);

        TaskNode node = new TaskNode(id, name, priority, dueDate);

        tail.next = node;
        tail = node;
        tail.next = head;   // circular

        size++;
        return true;
    }


    // ADD AT SPECIFIC POSITION
    public boolean addTaskAtIndex(int id, String name, String priority, String dueDate, int position){

        if(position < 0) return false;

        if(position == 0)
            return addTaskAtFirst(id, name, priority, dueDate);

        if(position >= size)
            return addTaskAtLast(id, name, priority, dueDate);

        TaskNode node = new TaskNode(id, name, priority, dueDate);

        TaskNode temp = head;
        int index = 0;

        while(index < position - 1){
            temp = temp.next;
            index++;
        }

        node.next = temp.next;
        temp.next = node;

        size++;
        return true;
    }


    // REMOVE BY TASK ID
    public boolean removeTask(int id){

        if(head == null) return false;

        // deleting head
        if(head.taskId == id){

            // only 1 node
            if(head == tail){
                head = tail = null;
            }
            else{
                head = head.next;
                tail.next = head;
            }

            size--;
            return true;
        }

        TaskNode temp = head;

        while(temp.next != head){

            // delete tail
            if(temp.next == tail && temp.next.taskId == id){

                tail = temp;
                tail.next = head;

                size--;
                return true;
            }

            // delete middle task
            if(temp.next.taskId == id){

                temp.next = temp.next.next;

                size--;
                return true;
            }

            temp = temp.next;
        }

        return false;
    }


    // VIEW CURRENT TASK & MOVE TO NEXT
    public TaskNode viewNextTask(TaskNode current){

        if(head == null) return null;

        if(current == null) return head;

        return current.next;   // circular ensures wraparound
    }


    // DISPLAY ALL TASKS
    public void displayTasks(){

        if(head == null){
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;

        do{
            System.out.println(
                "Task ID: " + temp.taskId +
                ", Name: " + temp.taskName +
                ", Priority: " + temp.priority +
                ", Due: " + temp.dueDate
            );

            temp = temp.next;

        }while(temp != head);
    }


    // SEARCH BY PRIORITY
    public void searchByPriority(String searchPriority){

        if(head == null){
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do{
            if(temp.priority.equalsIgnoreCase(searchPriority)){
                System.out.println(temp.taskName + " (ID " + temp.taskId + ")");
                found = true;
            }

            temp = temp.next;

        }while(temp != head);

        if(!found)
            System.out.println("No tasks found with priority: " + searchPriority);
    }
}
