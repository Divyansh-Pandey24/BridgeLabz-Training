package com.day02.cabbygo;

public class RideService implements IRideService {

    Vehicle vehicle;
    Driver driver;

    private double fare;
    private String location;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public void bookRide(double distance) {

        double baseFare = 50;

        fare = baseFare + (distance * vehicle.getRatePerKm());

        location = "Pickup";

        System.out.println("Ride Booked");
        System.out.println("Vehicle: " + vehicle.type);
        System.out.println("Driver: " + driver.name);
        System.out.println("Fare: " + fare);
        System.out.println("Capacity: "+ vehicle.capacity);
    }

    public void endRide() {
        location = "Completed";
        System.out.println("Ride Ended");
    }

    public double getFare() {
        return fare;
    }
}
