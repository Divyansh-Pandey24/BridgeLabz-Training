package com.day04.petpal;
public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        decreaseHunger(10);
        increaseMood(10);
    }

    @Override
    public void play() {
        increaseMood(12);
        decreaseEnergy(8);
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps happily!");
    }
}
