package com.annotation.overrideusage;
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
