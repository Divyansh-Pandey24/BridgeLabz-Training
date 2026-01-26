package com.annotation.jsonfield;
class Main {

    public static void main(String[] args) {

        User user = new User("Divyansh", 20, "secret123");

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
