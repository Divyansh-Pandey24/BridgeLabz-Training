package com.inheritance.single.smarthomedevices;

// Thermostat extends the Device class
public class Thermostat extends Device {

    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Displays thermostat details as well
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature  : " + temperatureSetting + " °C");
    }
}
