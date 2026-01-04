package com.linkedlists.circularlinkedlist.roundrobin;

public class RoundRobinScheduler {

    ProcessNode head = null;
    ProcessNode tail = null;
    int size = 0;


    // ADD PROCESS AT END
    public boolean addProcess(int id, int burst, int priority){

        ProcessNode node = new ProcessNode(id, burst, priority);

        if(head == null){
            head = tail = node;
            tail.next = head;
        }
        else{
            tail.next = node;
            tail = node;
            tail.next = head;
        }

        size++;
        return true;
    }


    // REMOVE PROCESS BY ID
    public boolean removeProcess(int id){

        if(head == null) return false;

        // delete head
        if(head.processId == id){

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

        ProcessNode temp = head;

        while(temp.next != head){

            if(temp.next.processId == id){

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


    // DISPLAY QUEUE
    public void displayQueue(){

        if(head == null){
            System.out.println("No processes in queue.");
            return;
        }

        ProcessNode temp = head;

        do{
            System.out.print("[P" + temp.processId + " | BT=" + temp.remainingTime + "] ");
            temp = temp.next;

        }while(temp != head);

        System.out.println();
    }


    // ROUND ROBIN SIMULATION
    public void simulate(int timeQuantum){

        if(head == null){
            System.out.println("No processes to schedule.");
            return;
        }

        int time = 0;
        double totalWaiting = 0;
        double totalTurnaround = 0;

        ProcessNode current = head;

        System.out.println("\n--- Round Robin Execution ---");

        while(size > 0){

            if(current.remainingTime > 0){

                int execTime = Math.min(timeQuantum, current.remainingTime);

                System.out.println("Executing Process P" + current.processId +
                                   " for " + execTime + " units.");

                current.remainingTime -= execTime;
                time += execTime;

                if(current.remainingTime == 0){

                    System.out.println("Process P" + current.processId + " completed.");

                    totalTurnaround += time;
                    totalWaiting += (time - current.burstTime);

                    int finishedId = current.processId;

                    current = current.next;
                    removeProcess(finishedId);
                }
                else{
                    current = current.next;
                }

                System.out.print("Queue: ");
                displayQueue();
            }
        }

        System.out.println("\nAverage Waiting Time: " + (totalWaiting / 3));
        System.out.println("Average Turnaround Time: " + (totalTurnaround / 3));
    }
}
