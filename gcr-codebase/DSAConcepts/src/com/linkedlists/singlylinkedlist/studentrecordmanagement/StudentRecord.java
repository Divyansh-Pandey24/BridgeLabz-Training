package com.linkedlists.singlylinkedlist.studentrecordmanagement;

public class StudentRecord {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        // INSERT RECORDS
        list.insertRecordAtFirst(101, "Amit", 20, 'A');
        list.insertRecordAtLast(102, "Riya", 19, 'B');
        list.insertRecordAtIndex(103, "Rahul", 21, 'C', 1);

        System.out.println("---- Student Records After Insertion ----");
        list.displayRecords();


        // DELETE A RECORD
        list.deleteRecord(102);
        System.out.println("\n---- After Deleting Roll 102 ----");
        list.displayRecords();


        // SEARCH A RECORD
        String name = list.search(103);
        System.out.println("\nSearch Result for Roll 103: " + name);


        // UPDATE GRADE
        list.updateGrade(101, 'C');
        System.out.println("\n---- After Updating Grade of Roll 101 ----");
        list.displayRecords();
    }
}
