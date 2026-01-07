package com.day04.eventease;
public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final String eventId;   // cannot be modified once assigned
    private double baseVenueCost;
    private double serviceCost;     
    private double discount;        

    private boolean isScheduled;

    public Event(String eventId, String eventName, String location, String date,
                 int attendees, double baseVenueCost, double serviceCost, double discount) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.baseVenueCost = baseVenueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.isScheduled = false;
    }

    public String getEventId() {
        return eventId;
    }

    // Encapsulated pricing logic
    public double calculateTotalCost() {
        return (baseVenueCost + serviceCost) - discount;
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(eventName + " rescheduled to " + date);
    }

    @Override
    public void cancel() {
        isScheduled = false;
        System.out.println(eventName + " has been cancelled.");
    }
}
