package com.day05.parkease;
public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public int getSlotId() {
        return slotId;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    public String getLocation() {
        return location;
    }

    // Encapsulation: only internal system can update availability
    protected void occupy() {
        isOccupied = true;
    }

    protected void vacate() {
        isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}
