package com.day04.petpal;
public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        decreaseHunger(15);
        increaseMood(5);
    }

    @Override
    public void play() {
        increaseMood(15);
        decreaseEnergy(10);
        increaseHunger(8);
    }

    @Override
    public void sleep() {
        increaseEnergy(25);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
