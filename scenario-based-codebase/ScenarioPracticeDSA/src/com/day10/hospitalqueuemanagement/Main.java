package com.day10.hospitalqueuemanagement;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        HospitalQueueAVL queue = new HospitalQueueAVL();

        Patient p1 = new Patient(1, "Aman", LocalDateTime.of(2026, 1, 10, 9, 0));
        Patient p2 = new Patient(2, "Neha", LocalDateTime.of(2026, 1, 10, 8, 30));
        Patient p3 = new Patient(3, "Ravi", LocalDateTime.of(2026, 1, 10, 9, 15));

        queue.register(p1);
        queue.register(p2);
        queue.register(p3);

        queue.displayByArrivalTime();

        System.out.println();

        queue.discharge(p2);

        queue.displayByArrivalTime();
    }
}
