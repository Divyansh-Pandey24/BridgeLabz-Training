package com.annotation.suppresswarnings;
import java.util.ArrayList;

class UncheckedWarningDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(10);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
