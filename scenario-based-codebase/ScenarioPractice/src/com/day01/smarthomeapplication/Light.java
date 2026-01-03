package com.day01.smarthomeapplication;

class Light extends Appliance implements Controllable {

    public Light(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        setState(true);
    }

    @Override
    public void turnOff() {
        setState(false);
    }
}
