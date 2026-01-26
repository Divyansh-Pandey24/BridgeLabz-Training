package com.day10.onlineticketbooking;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        EventSchedule schedule = new EventSchedule();

        schedule.addEvent(new Event(
                "E101",
                "Concert",
                LocalDateTime.of(2026, 3, 10, 18, 0)
        ));

        schedule.addEvent(new Event(
                "E102",
                "Tech Talk",
                LocalDateTime.of(2026, 2, 5, 10, 30)
        ));

        schedule.addEvent(new Event(
                "E103",
                "Comedy Show",
                LocalDateTime.of(2026, 4, 1, 20, 0)
        ));

        schedule.displayUpcomingEvents();

        schedule.cancelEvent(LocalDateTime.of(2026, 3, 10, 18, 0));

        System.out.println();

        schedule.displayUpcomingEvents();
    }
}
