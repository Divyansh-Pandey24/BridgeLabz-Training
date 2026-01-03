package com.day01.smarthomeapplication;

class Fan extends Appliance implements Controllable {

    public Fan(String name, int power) {
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
