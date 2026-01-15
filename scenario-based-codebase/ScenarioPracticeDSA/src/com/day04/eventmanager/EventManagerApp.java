package com.day04.eventmanager;
public class EventManagerApp {

    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket("Rock Concert", 2500),
            new Ticket("Tech Conference", 4500),
            new Ticket("Movie Premiere", 1200),
            new Ticket("Comedy Show", 1800),
            new Ticket("Cricket Match", 3200)
        };

        System.out.println("Before Sorting");
        TicketSorter.display(tickets);

        TicketSorter.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting by Ticket Price");
        TicketSorter.display(tickets);
    }
}
