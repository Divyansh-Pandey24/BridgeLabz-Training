package com.day03.parceltracker;

public class Parcel {

    private StageNode head;

    public Parcel() {
        head = new StageNode("Packed");
        StageNode shipped = new StageNode("Shipped");
        StageNode transit = new StageNode("In Transit");
        StageNode delivered = new StageNode("Delivered");

        head.next = shipped;
        shipped.next = transit;
        transit.next = delivered;
    }

    public void trackParcel() {
        StageNode temp = head;
        System.out.println("\nParcel Tracking:");
        while (temp != null) {
            System.out.print(temp.stage + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stage.equalsIgnoreCase(afterStage)) {
                StageNode node = new StageNode(newStage);
                node.next = temp.next;
                temp.next = node;
                System.out.println("Checkpoint added.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found!");
    }

    public void markLost(String stage) {
        StageNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.stage.equalsIgnoreCase(stage)) {
                temp.next = null;
                System.out.println("Parcel lost after " + stage);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found!");
    }
}
