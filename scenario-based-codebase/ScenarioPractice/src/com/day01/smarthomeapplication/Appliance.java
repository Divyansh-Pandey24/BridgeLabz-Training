package com.day01.smarthomeapplication;

class Appliance {

    protected String name;
    private int power;         // watts (internal setting)
    private boolean state;     // ON / OFF

    // default power
    public Appliance(String name) {
        this.name = name;
        this.power = 50;
        this.state = false;
    }

    // user-defined power
    public Appliance(String name, int power) {
        this.name = name;
        this.power = power;
        this.state = false;
    }

    public int getPower() {
        return power;
    }

    protected void setState(boolean state) {
        this.state = state;
    }
}
