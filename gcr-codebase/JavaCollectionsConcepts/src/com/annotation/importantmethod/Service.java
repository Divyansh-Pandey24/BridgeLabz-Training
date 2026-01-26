package com.annotation.importantmethod;
class Service {

    @ImportantMethod
    void saveData() {
        System.out.println("Saving data");
    }

    @ImportantMethod(level = "MEDIUM")
    void loadData() {
        System.out.println("Loading data");
    }

    void helperMethod() {
        System.out.println("Helper method");
    }
}
