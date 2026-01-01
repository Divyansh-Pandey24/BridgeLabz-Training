package com.inheritance.single.smarthomedevices;

// Base class for Smart Home devices
public class Device {

    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Displays basic device info
    public void displayStatus() {
        System.out.println("Device ID    : " + deviceId);
        System.out.println("Status       : " + status);
    }
}
