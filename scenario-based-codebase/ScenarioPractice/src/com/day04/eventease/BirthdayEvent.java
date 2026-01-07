package com.day04.eventease;
public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventId, String name, String location, String date,
                         int attendees, double venueCost, double serviceCost, double discount) {

        super(eventId, name, location, date, attendees, venueCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday party scheduled at " + location + " on " + date);
    }
}
