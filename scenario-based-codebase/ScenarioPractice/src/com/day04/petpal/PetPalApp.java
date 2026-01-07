package com.day04.petpal;
import java.util.Scanner;

public class PetPalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Pet Type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Pet Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Pet Age: ");
        int age = sc.nextInt();

        Pet pet;

        if (choice == 1) pet = new Dog(name, age);
        else if (choice == 2) pet = new Cat(name, age);
        else pet = new Bird(name, age);

        System.out.println("\n--- Interact With Your Pet ---");

        pet.makeSound();

        pet.feed();
        pet.play();
        pet.sleep();

        System.out.println("\nPet Hunger: " + pet.getHunger());
        System.out.println("Pet Mood: " + pet.getMood());
        System.out.println("Pet Energy: " + pet.getEnergy());

        sc.close();
    }
}
