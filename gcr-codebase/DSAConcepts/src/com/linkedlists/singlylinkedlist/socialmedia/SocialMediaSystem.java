package com.linkedlists.singlylinkedlist.socialmedia;

public class SocialMediaSystem {

    public static void main(String[] args) {

        SocialMediaList sm = new SocialMediaList();

        sm.addUser(1, "Amit", 22);
        sm.addUser(2, "Riya", 21);
        sm.addUser(3, "Rahul", 23);
        sm.addUser(4, "Neha", 22);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        System.out.println("\nAll Users:");
        sm.displayAllUsers();

        System.out.println("\nFriend List:");
        sm.displayFriends(1);

        System.out.println("\nMutual Friends of 1 & 3:");
        sm.findMutualFriends(1, 3);

        System.out.println("\nFriend Counts:");
        sm.countFriends();

        sm.removeFriend(1, 2);

        System.out.println("\nAfter Removing Friendship (1,2):");
        sm.displayFriends(1);
    }
}
