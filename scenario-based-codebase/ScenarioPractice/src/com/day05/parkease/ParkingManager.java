package com.day05.parkease;
import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<ParkingSlot> slots = new ArrayList<>();

    // internal booking records
    private List<String> bookingLogs = new ArrayList<>();

    public void addSlot(ParkingSlot slot) {
        slots.add(slot);
    }

    public ParkingSlot assignSlot(String vehicleType) {

        for (ParkingSlot s : slots) {
            if (!s.isOccupied() && s.getVehicleTypeAllowed().equalsIgnoreCase(vehicleType)) {
                s.occupy();
                bookingLogs.add("Slot " + s.getSlotId() + " booked for " + vehicleType);
                return s;
            }
        }
        return null;
    }

    public void releaseSlot(ParkingSlot slot) {
        slot.vacate();
        bookingLogs.add("Slot " + slot.getSlotId() + " released");
    }

    // Read-only logs exposed
    public void showLogs() {
        System.out.println("\n--- Booking Logs ---");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
