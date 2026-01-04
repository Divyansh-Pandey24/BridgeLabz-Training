package com.linkedlists.singlylinkedlist.socialmedia;

import java.util.ArrayList;

public class UserNode {

    int userId;
    String name;
    int age;

    ArrayList<Integer> friends;   // Stores friend user IDs

    UserNode next;

    public UserNode(int userId, String name, int age){
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}
