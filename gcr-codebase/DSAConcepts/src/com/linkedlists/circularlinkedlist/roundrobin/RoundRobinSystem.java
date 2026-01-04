package com.linkedlists.circularlinkedlist.roundrobin;

public class RoundRobinSystem {

    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        System.out.println("Initial Queue:");
        scheduler.displayQueue();

        int timeQuantum = 3;

        scheduler.simulate(timeQuantum);
    }
}
