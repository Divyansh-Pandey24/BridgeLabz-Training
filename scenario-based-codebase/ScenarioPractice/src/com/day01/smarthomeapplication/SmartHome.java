package com.day01.smarthomeapplication;

public class SmartHome {

    public static void main(String[] args) {

        Light light = new Light("Bedroom Light", 40);
        Fan fan = new Fan("Ceiling Fan", 70);
        AC ac = new AC("Living Room AC", 1500);

        UserController controller = new UserController();

        light.turnOn();
        fan.turnOn();
        ac.turnOff();

        controller.compareEnergy(light, fan);
        controller.compareEnergy(fan, ac);
    }
}
