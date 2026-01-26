package com.day10.gamingapp;
public class LeaderboardAVL {

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

    private int compare(Player a, Player b) {
        if (a.getScore() != b.getScore()) {
            return b.getScore() - a.getScore();
        }
        return a.getPlayerId() - b.getPlayerId();
    }

    public void insert(Player player) {
        root = insert(root, player);
    }

    private AVLNode insert(AVLNode node, Player player) {
        if (node == null) return new AVLNode(player);

        if (compare(player, node.player) < 0)
            node.left = insert(node.left, player);
        else
            node.right = insert(node.right, player);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = balance(node);

        if (balance > 1 && compare(player, node.left.player) < 0)
            return rightRotate(node);

        if (balance < -1 && compare(player, node.right.player) > 0)
            return leftRotate(node);

        if (balance > 1 && compare(player, node.left.player) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && compare(player, node.right.player) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void remove(Player player) {
        root = remove(root, player);
    }

    private AVLNode remove(AVLNode node, Player player) {
        if (node == null) return null;

        if (compare(player, node.player) < 0)
            node.left = remove(node.left, player);
        else if (compare(player, node.player) > 0)
            node.right = remove(node.right, player);
        else {
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                AVLNode temp = minValue(node.right);
                node.player = temp.player;
                node.right = remove(node.right, temp.player);
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

    public void displayTopPlayers(int limit) {
        displayTopPlayers(root, new int[]{0}, limit);
    }

    private void displayTopPlayers(AVLNode node, int[] count, int limit) {
        if (node == null || count[0] >= limit) return;

        displayTopPlayers(node.left, count, limit);

        if (count[0] < limit) {
            System.out.println(node.player);
            count[0]++;
        }

        displayTopPlayers(node.right, count, limit);
    }
}
