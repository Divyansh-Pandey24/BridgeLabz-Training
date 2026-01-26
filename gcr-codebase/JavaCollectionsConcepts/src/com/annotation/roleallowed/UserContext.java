package com.annotation.roleallowed;
class UserContext {

    private static String currentRole;

    static void setRole(String role) {
        currentRole = role;
    }

    static String getRole() {
        return currentRole;
    }
}
