package com.linkedlists.circularlinkedlist.ticketreservation;

public class TicketSystem {

    public static void main(String[] args) {

        TicketCircularList tickets = new TicketCircularList();

        tickets.addTicket(1, "Amit", "Inception", "A1", "10:00 AM");
        tickets.addTicket(2, "Riya", "Avatar", "B2", "12:30 PM");
        tickets.addTicket(3, "Rahul", "Inception", "A2", "10:00 AM");

        System.out.println("\nAll Tickets:");
        tickets.displayTickets();

        tickets.removeTicket(2);

        System.out.println("\nAfter Removing Ticket 2:");
        tickets.displayTickets();

        System.out.println("\nSearch by Customer 'Amit':");
        tickets.searchByCustomer("Amit");

        System.out.println("\nSearch by Movie 'Inception':");
        tickets.searchByMovie("Inception");

        System.out.println("\nTotal Tickets: " + tickets.totalTickets());
    }
}
