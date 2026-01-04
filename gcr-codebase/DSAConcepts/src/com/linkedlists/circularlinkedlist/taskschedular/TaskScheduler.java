package com.linkedlists.circularlinkedlist.taskschedular;

public class TaskScheduler {

	    public static void main(String[] args) {

	        TaskCircularList scheduler = new TaskCircularList();

	        scheduler.addTaskAtFirst(1, "Write Report", "High", "10-Jan-2026");
	        scheduler.addTaskAtLast(2, "Team Meeting", "Medium", "12-Jan-2026");
	        scheduler.addTaskAtIndex(3, "Code Review", "High", "11-Jan-2026", 1);

	        System.out.println("\nAll Tasks:");
	        scheduler.displayTasks();

	        scheduler.removeTask(2);

	        System.out.println("\nAfter Removing Task 2:");
	        scheduler.displayTasks();

	        System.out.println("\nTasks with High Priority:");
	        scheduler.searchByPriority("High");

	        TaskNode current = null;

	        System.out.println("\nCycling Through Tasks:");

	        current = scheduler.viewNextTask(current);
	        System.out.println(current.taskName);

	        current = scheduler.viewNextTask(current);
	        System.out.println(current.taskName);

	        current = scheduler.viewNextTask(current);
	        System.out.println(current.taskName);
	    }
	}

