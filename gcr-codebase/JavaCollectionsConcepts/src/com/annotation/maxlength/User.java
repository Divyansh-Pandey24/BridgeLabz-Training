package com.annotation.maxlength;
import java.lang.reflect.Field;

class User {

    @MaxLength(10)
    private String username;

    User(String username) {
        validate(username);
        this.username = username;
    }

    private void validate(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (maxLength != null && username.length() > maxLength.value()) {
                throw new IllegalArgumentException(
                        "Username length exceeds maximum of " + maxLength.value()
                );
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "User{username='" + username + "'}";
    }
}
