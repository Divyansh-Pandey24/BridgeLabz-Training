package com.day04.petpal;
import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // 0 = full, 100 = starving
    private int mood;     // 0 = sad, 100 = happy
    private int energy;   // 0 = tired, 100 = fresh

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(50) + 25;
        this.mood = r.nextInt(50) + 25;
        this.energy = r.nextInt(50) + 25;
    }

    // Overloaded constructor — user specifies levels
    public Pet(String name, String type, int age, int hunger, int mood, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.mood = mood;
        this.energy = energy;
    }

    // Encapsulated getters only
    public int getHunger() { return hunger; }
    public int getMood() { return mood; }
    public int getEnergy() { return energy; }

    // Internal state only changes through interactions
    protected void increaseMood(int value) {
        mood = Math.min(100, mood + value);
    }

    protected void decreaseMood(int value) {
        mood = Math.max(0, mood - value);
    }

    protected void increaseEnergy(int value) {
        energy = Math.min(100, energy + value);
    }

    protected void decreaseEnergy(int value) {
        energy = Math.max(0, energy - value);
    }

    protected void decreaseHunger(int value) {
        hunger = Math.max(0, hunger - value);
    }

    protected void increaseHunger(int value) {
        hunger = Math.min(100, hunger + value);
    }

    public abstract void makeSound();
}
