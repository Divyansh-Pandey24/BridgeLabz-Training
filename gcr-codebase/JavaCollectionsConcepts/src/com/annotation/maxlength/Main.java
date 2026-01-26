package com.annotation.maxlength;
class Main {

    public static void main(String[] args) {

        User user1 = new User("Divyansh");
        System.out.println(user1);

        User user2 = new User("VeryLongUsername");
        System.out.println(user2);
    }
}
