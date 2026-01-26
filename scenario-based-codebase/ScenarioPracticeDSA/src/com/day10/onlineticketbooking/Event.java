package com.day10.onlineticketbooking;
import java.time.LocalDateTime;

public class Event {
    private String eventId;
    private String name;
    private LocalDateTime startTime;

    public Event(String eventId, String name, LocalDateTime startTime) {
        this.eventId = eventId;
        this.name = name;
        this.startTime = startTime;
    }

    public String getEventId() {
        return eventId;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return "EventID: " + eventId + ", Name: " + name + ", Time: " + startTime;
    }
}
