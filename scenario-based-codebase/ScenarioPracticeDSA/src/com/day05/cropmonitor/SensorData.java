package com.day05.cropmonitor;
class SensorData {
    long timestamp;
    double temperature;

    SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    void display() {
        System.out.println(timestamp + " Temperature " + temperature);
    }
}
