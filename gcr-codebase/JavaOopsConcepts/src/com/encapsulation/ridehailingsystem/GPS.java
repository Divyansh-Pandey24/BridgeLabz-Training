package com.encapsulation.ridehailingsystem;

public interface GPS {

    // Method to get current location
    String getCurrentLocation();

    // Method to update current location
    void updateLocation(String newLocation);
}

