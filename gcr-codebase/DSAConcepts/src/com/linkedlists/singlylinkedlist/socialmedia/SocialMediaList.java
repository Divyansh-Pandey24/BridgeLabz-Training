package com.linkedlists.singlylinkedlist.socialmedia;

import java.util.ArrayList;

public class SocialMediaList {

    UserNode head = null;
    UserNode tail = null;
    int size = 0;


    // ADD USER AT END
    public boolean addUser(int id, String name, int age){

        UserNode node = new UserNode(id, name, age);

        if(head == null){
            head = tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }

        size++;
        return true;
    }


    // SEARCH USER BY ID
    public UserNode searchById(int id){

        UserNode temp = head;

        while(temp != null){

            if(temp.userId == id)
                return temp;

            temp = temp.next;
        }

        return null;
    }


    // SEARCH USER BY NAME
    public UserNode searchByName(String name){

        UserNode temp = head;

        while(temp != null){

            if(temp.name.equalsIgnoreCase(name))
                return temp;

            temp = temp.next;
        }

        return null;
    }


    // ADD FRIEND CONNECTION (BIDIRECTIONAL)
    public boolean addFriend(int user1, int user2){

        UserNode u1 = searchById(user1);
        UserNode u2 = searchById(user2);

        if(u1 == null || u2 == null) return false;

        if(!u1.friends.contains(user2))
            u1.friends.add(user2);

        if(!u2.friends.contains(user1))
            u2.friends.add(user1);

        return true;
    }


    // REMOVE FRIEND CONNECTION
    public boolean removeFriend(int user1, int user2){

        UserNode u1 = searchById(user1);
        UserNode u2 = searchById(user2);

        if(u1 == null || u2 == null) return false;

        u1.friends.remove(Integer.valueOf(user2));
        u2.friends.remove(Integer.valueOf(user1));

        return true;
    }


    // DISPLAY FRIENDS OF USER
    public void displayFriends(int userId){

        UserNode user = searchById(userId);

        if(user == null){
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");

        if(user.friends.isEmpty()){
            System.out.println("No friends.");
            return;
        }

        for(Integer id : user.friends){
            UserNode f = searchById(id);
            System.out.println("ID: " + f.userId + ", Name: " + f.name);
        }
    }


    // FIND MUTUAL FRIENDS
    public void findMutualFriends(int user1, int user2){

        UserNode u1 = searchById(user1);
        UserNode u2 = searchById(user2);

        if(u1 == null || u2 == null){
            System.out.println("One or both users not found.");
            return;
        }

        System.out.println("Mutual Friends:");

        boolean found = false;

        for(Integer id1 : u1.friends){

            if(u2.friends.contains(id1)){

                UserNode mf = searchById(id1);
                System.out.println(mf.name + " (ID " + mf.userId + ")");
                found = true;
            }
        }

        if(!found)
            System.out.println("No mutual friends.");
    }


    // COUNT FRIENDS OF EACH USER
    public void countFriends(){

        UserNode temp = head;

        while(temp != null){

            System.out.println(
                temp.name + " has " + temp.friends.size() + " friends."
            );

            temp = temp.next;
        }
    }


    // DISPLAY ALL USERS
    public void displayAllUsers(){

        UserNode temp = head;

        while(temp != null){

            System.out.println(
                "ID: " + temp.userId +
                " | Name: " + temp.name +
                " | Age: " + temp.age
            );

            temp = temp.next;
        }
    }
}
