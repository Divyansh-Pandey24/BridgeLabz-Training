package com.day04.petpal;
public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        decreaseHunger(20);
        increaseMood(10);
    }

    @Override
    public void play() {
        increaseMood(20);
        decreaseEnergy(15);
        increaseHunger(10);
    }

    @Override
    public void sleep() {
        increaseEnergy(30);
        decreaseHunger(5);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
