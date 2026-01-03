package com.day01.vehiclerentalapplication;

//Base class for all vehicles
class Vehicle {

 protected String vehicleId;
 protected String brand;
 protected double baseRatePerDay;

 private boolean available = true;   // encapsulated

 public Vehicle(String vehicleId, String brand, double baseRatePerDay) {
     this.vehicleId = vehicleId;
     this.brand = brand;
     this.baseRatePerDay = baseRatePerDay;
 }

 public boolean isAvailable() {
     return available;
 }

 public void setAvailable(boolean available) {
     this.available = available;
 }

 public void displayDetails() {
     System.out.println("Vehicle ID: " + vehicleId +
             ", Brand: " + brand +
             ", Rate/Day: ₹" + baseRatePerDay);
 }
}

