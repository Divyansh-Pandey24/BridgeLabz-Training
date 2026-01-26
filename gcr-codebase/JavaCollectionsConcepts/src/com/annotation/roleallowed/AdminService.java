package com.annotation.roleallowed;
class AdminService {

    @RoleAllowed("ADMIN")
    void deleteUser() {
        System.out.println("User deleted successfully");
    }

    void viewUser() {
        System.out.println("Viewing user");
    }
}
