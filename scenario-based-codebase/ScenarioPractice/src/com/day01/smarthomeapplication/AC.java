package com.day01.smarthomeapplication;

class AC extends Appliance implements Controllable {

    public AC(String name, int power) {
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
