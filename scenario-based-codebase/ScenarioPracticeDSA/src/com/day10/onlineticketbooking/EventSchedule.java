package com.day10.onlineticketbooking;
import java.time.LocalDateTime;
import java.util.TreeMap;

public class EventSchedule {

    private TreeMap<LocalDateTime, Event> eventMap;

    public EventSchedule() {
        eventMap = new TreeMap<>();
    }

    public void addEvent(Event event) {
        eventMap.put(event.getStartTime(), event);
    }

    public void cancelEvent(LocalDateTime startTime) {
        eventMap.remove(startTime);
    }

    public void displayUpcomingEvents() {
        for (Event event : eventMap.values()) {
            System.out.println(event);
        }
    }
}
