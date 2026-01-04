package com.linkedlists.circularlinkedlist.ticketreservation;

public class TicketCircularList {

    TicketNode head = null;
    TicketNode tail = null;
    int size = 0;


    // ADD TICKET AT END
    public boolean addTicket(int id, String cname, String mname,
                             String seat, String time){

        TicketNode node = new TicketNode(id, cname, mname, seat, time);

        if(head == null){

            head = tail = node;
            tail.next = head;   // make circular
        }
        else{

            tail.next = node;
            tail = node;
            tail.next = head;
        }

        size++;
        return true;
    }


    // REMOVE TICKET BY ID
    public boolean removeTicket(int id){

        if(head == null) return false;

        // deleting head
        if(head.ticketId == id){

            // only one node
            if(head == tail){
                head = tail = null;
            }
            else{
                head = head.next;
                tail.next = head;
            }

            size--;
            return true;
        }

        TicketNode temp = head;

        while(temp.next != head){

            if(temp.next.ticketId == id){

                if(temp.next == tail){
                    tail = temp;
                }

                temp.next = temp.next.next;

                size--;
                return true;
            }

            temp = temp.next;
        }

        return false;
    }


    // DISPLAY ALL TICKETS
    public void displayTickets(){

        if(head == null){
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;

        do{

            System.out.println(
                "Ticket ID: " + temp.ticketId +
                " | Customer: " + temp.customerName +
                " | Movie: " + temp.movieName +
                " | Seat: " + temp.seatNumber +
                " | Time: " + temp.bookingTime
            );

            temp = temp.next;

        }while(temp != head);
    }


    // SEARCH BY CUSTOMER NAME
    public void searchByCustomer(String name){

        if(head == null){
            System.out.println("No tickets found.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do{

            if(temp.customerName.equalsIgnoreCase(name)){

                System.out.println(
                    "Ticket ID: " + temp.ticketId +
                    " | Movie: " + temp.movieName +
                    " | Seat: " + temp.seatNumber
                );
                found = true;
            }

            temp = temp.next;

        }while(temp != head);

        if(!found)
            System.out.println("No ticket found for customer: " + name);
    }


    // SEARCH BY MOVIE NAME
    public void searchByMovie(String movie){

        if(head == null){
            System.out.println("No tickets found.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do{

            if(temp.movieName.equalsIgnoreCase(movie)){

                System.out.println(
                    "Ticket ID: " + temp.ticketId +
                    " | Customer: " + temp.customerName +
                    " | Seat: " + temp.seatNumber
                );
                found = true;
            }

            temp = temp.next;

        }while(temp != head);

        if(!found)
            System.out.println("No ticket found for movie: " + movie);
    }


    // TOTAL TICKETS
    public int totalTickets(){
        return size;
    }
}
