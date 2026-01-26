package com.annotation.roleallowed;
import java.lang.reflect.Method;

class Main {

    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        UserContext.setRole("USER");
        invoke(service, "deleteUser");

        UserContext.setRole("ADMIN");
        invoke(service, "deleteUser");
    }

    static void invoke(Object obj, String methodName) throws Exception {

        Method method = obj.getClass().getDeclaredMethod(methodName);

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

            if (!roleAllowed.value().equals(UserContext.getRole())) {
                System.out.println("Access Denied!");
                return;
            }
        }

        method.invoke(obj);
    }
}
