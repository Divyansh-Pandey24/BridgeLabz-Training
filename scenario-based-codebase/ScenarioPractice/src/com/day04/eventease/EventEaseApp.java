package com.day04.eventease;
import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Organizer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Organizer Email:");
        String email = sc.nextLine();

        User organizer = new User(name, email);

        System.out.println("\nChoose Event Type:");
        System.out.println("1. Birthday");
        System.out.println("2. Conference");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Event Name:");
        String eventName = sc.nextLine();

        System.out.println("Enter Location:");
        String location = sc.nextLine();

        System.out.println("Enter Date:");
        String date = sc.nextLine();

        System.out.println("Enter Number of Attendees:");
        int attendees = sc.nextInt();

        System.out.println("Enter Venue Cost:");
        double venue = sc.nextDouble();

        System.out.println("Enter Service Cost:");
        double services = sc.nextDouble();

        System.out.println("Enter Discount:");
        double discount = sc.nextDouble();

        Event event;

        if (choice == 1) {
            event = new BirthdayEvent("EVT101", eventName, location, date,
                    attendees, venue, services, discount);

        } else {
            event = new ConferenceEvent("EVT202", eventName, location, date,
                    attendees, venue, services, discount);
        }

        System.out.println("\n---- EVENT SUMMARY ----");
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Event ID: " + event.getEventId());
        event.schedule();

        System.out.println("Total Cost: " + event.calculateTotalCost());

        sc.close();
    }
}
