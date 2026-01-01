package com.inheritance.single.smarthomedevices;

// Main execution class
public class SmartHomeDevices {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH-001", "ON", 24.5);

        System.out.println("--- Smart Home Device Details ---");
        thermostat.displayStatus();
    }
}
