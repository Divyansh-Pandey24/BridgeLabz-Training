package com.day9.universityrecordsystem;
class StudentBST {

    Node root;

    Node insert(Node root, int roll, String name) {

        if (root == null) {
            return new Node(roll, name);
        }

        if (roll < root.roll) {
            root.left = insert(root.left, roll, name);
        } else if (roll > root.roll) {
            root.right = insert(root.right, roll, name);
        }

        return root;
    }

    Node search(Node root, int roll) {

        if (root == null || root.roll == roll) {
            return root;
        }

        if (roll < root.roll) {
            return search(root.left, roll);
        }

        return search(root.right, roll);
    }

    Node delete(Node root, int roll) {

        if (root == null) {
            return null;
        }

        if (roll < root.roll) {
            root.left = delete(root.left, roll);
        } else if (roll > root.roll) {
            root.right = delete(root.right, roll);
        } else {

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            Node successor = findMin(root.right);
            root.roll = successor.roll;
            root.name = successor.name;
            root.right = delete(root.right, successor.roll);
        }

        return root;
    }

    Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.println(root.roll + " " + root.name);
            inorder(root.right);
        }
    }
}
