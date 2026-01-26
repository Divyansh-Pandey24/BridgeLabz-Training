package com.day9.universityrecordsystem;
public class UniversityRecordSystem {

    public static void main(String[] args) {

        StudentBST bst = new StudentBST();

        bst.root = bst.insert(bst.root, 105, "Amit");
        bst.root = bst.insert(bst.root, 102, "Neha");
        bst.root = bst.insert(bst.root, 110, "Ravi");
        bst.root = bst.insert(bst.root, 101, "Pooja");

        System.out.println("Sorted student roll numbers");
        bst.inorder(bst.root);

        System.out.println("Searching roll number 102");
        Node result = bst.search(bst.root, 102);
        if (result != null) {
            System.out.println("Found " + result.name);
        }

        System.out.println("Deleting roll number 105");
        bst.root = bst.delete(bst.root, 105);

        System.out.println("After deletion");
        bst.inorder(bst.root);
    }
}
