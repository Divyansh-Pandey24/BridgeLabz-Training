package com.day03.campusconnect;
public class Person {

    protected String name;
    protected String email;
    protected String id;

    public Person(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public void printDetails() {
        System.out.println("Person: " + name);
    }
}
