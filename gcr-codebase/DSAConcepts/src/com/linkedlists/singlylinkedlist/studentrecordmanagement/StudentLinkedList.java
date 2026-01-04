package com.linkedlists.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {

	StudentNode head = null;
	StudentNode tail = null;
	int size = 0;

	public boolean insertRecordAtFirst(int rollNumber, String name, int age, char grade) {

		StudentNode node = new StudentNode(rollNumber, name, age, grade);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size++;
		return true;
	}

	public boolean insertRecordAtLast(int rollNumber, String name, int age, char grade) {

		if (head == null) {
			return insertRecordAtFirst(rollNumber, name, age, grade);
		}

		StudentNode node = new StudentNode(rollNumber, name, age, grade);
		tail.next = node;
		tail = node;
		size++;
		return true;
	}

	public boolean insertRecordAtIndex(int rollNumber, String name, int age, char grade, int position) {

		if (position < 0)
			return false;

		StudentNode temp = head;
		if (position == 0) {
			return insertRecordAtFirst(rollNumber, name, age, grade);
		}

		if (position >= size) {
			return insertRecordAtLast(rollNumber, name, age, grade);
		}

		StudentNode node = new StudentNode(rollNumber, name, age, grade);

		int index = 0;
		while (index < position - 1) {
			temp = temp.next;
			index++;
		}
		node.next = temp.next;
		temp.next = node;

		size++;
		return true;
	}

	public boolean deleteRecord(int rollNumber) {
		StudentNode temp = head;

		if (temp == null)
			return false;
		if (temp.rollNumber == rollNumber) {
			head = head.next;
			if (head == null) {
				tail = head;
			}
			size--;
			return true;
		}

		while (temp.next != null) {

			if (temp.next == tail && temp.next.rollNumber == rollNumber) {
				tail = temp;
				temp.next = null;
				size--;
				return true;
			}
			if (temp.next.rollNumber == rollNumber) {

				temp.next = temp.next.next;
				size--;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public String search(int rollNumber) {
		StudentNode temp = head;
		while (temp != null) {
			if (temp.rollNumber == rollNumber) {
				return temp.name;
			}
			temp = temp.next;
		}

		return "doesn't exist";
	}
	
	public boolean updateGrade(int rollNumber, char newGrade) {
		StudentNode temp = head;
		while (temp != null) {
			if (temp.rollNumber == rollNumber) {
				temp.grade = newGrade;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public void displayRecords() {
		if (head == null) {
			System.out.println("No record");
			return;
		}
		
		StudentNode temp = head;
		
		while (temp !=  null) {
			System.out.println(
	                "Roll: " + temp.rollNumber +
	                ", Name: " + temp.name +
	                ", Age: " + temp.age +
	                ", Grade: " + temp.grade
	            );
			temp = temp.next;
		}
	}

}
