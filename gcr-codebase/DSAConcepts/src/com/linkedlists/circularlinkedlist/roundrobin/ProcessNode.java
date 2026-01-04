package com.linkedlists.circularlinkedlist.roundrobin;

public class ProcessNode {

    int processId;
    int burstTime;
    int priority;

    int remainingTime; // used in scheduling

    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority){
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}
