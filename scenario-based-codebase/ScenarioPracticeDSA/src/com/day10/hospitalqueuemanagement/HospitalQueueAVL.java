package com.day10.hospitalqueuemanagement;
public class HospitalQueueAVL {

    private AVLNode root;

    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    private int balance(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    private int compare(Patient a, Patient b) {
        int timeCompare = a.getArrivalTime().compareTo(b.getArrivalTime());
        if (timeCompare != 0) return timeCompare;
        return a.getPatientId() - b.getPatientId();
    }

    public void register(Patient patient) {
        root = insert(root, patient);
    }

    private AVLNode insert(AVLNode node, Patient patient) {
        if (node == null) return new AVLNode(patient);

        if (compare(patient, node.patient) < 0)
            node.left = insert(node.left, patient);
        else
            node.right = insert(node.right, patient);

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        int balance = balance(node);

        if (balance > 1 && compare(patient, node.left.patient) < 0)
            return rightRotate(node);

        if (balance < -1 && compare(patient, node.right.patient) > 0)
            return leftRotate(node);

        if (balance > 1 && compare(patient, node.left.patient) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && compare(patient, node.right.patient) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void discharge(Patient patient) {
        root = delete(root, patient);
    }

    private AVLNode delete(AVLNode node, Patient patient) {
        if (node == null) return null;

        if (compare(patient, node.patient) < 0)
            node.left = delete(node.left, patient);
        else if (compare(patient, node.patient) > 0)
            node.right = delete(node.right, patient);
        else {
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                AVLNode temp = minValue(node.right);
                node.patient = temp.patient;
                node.right = delete(node.right, temp.patient);
            }
        }

        if (node == null) return null;

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        int balance = balance(node);

        if (balance > 1 && balance(node.left) >= 0)
            return rightRotate(node);

        if (balance > 1 && balance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && balance(node.right) <= 0)
            return leftRotate(node);

        if (balance < -1 && balance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private AVLNode minValue(AVLNode node) {
        AVLNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    public void displayByArrivalTime() {
        inorder(root);
    }

    private void inorder(AVLNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.patient);
        inorder(node.right);
    }
}
