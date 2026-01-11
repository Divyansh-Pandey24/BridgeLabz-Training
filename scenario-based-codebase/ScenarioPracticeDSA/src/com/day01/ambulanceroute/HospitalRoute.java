package com.day01.ambulanceroute;
public class HospitalRoute {
    private UnitNode head;

    public HospitalRoute() {
        head = null;
    }

    public void addUnit(String unitName) {
        UnitNode newNode = new UnitNode(unitName);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            UnitNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public String findAvailableUnit() {
        if (head == null) {
            return "No units available";
        }
        UnitNode temp = head;
        do {
            if (temp.available) {
                return temp.unitName;
            }
            temp = temp.next;
        } while (temp != head);
        return "All units busy";
    }

    public void setMaintenance(String unitName, boolean underMaintenance) {
        if (head == null) return;
        UnitNode temp = head;
        do {
            if (temp.unitName.equals(unitName)) {
                temp.available = !underMaintenance;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void removeUnit(String unitName) {
        if (head == null) return;
        if (head.unitName.equals(unitName)) {
            if (head.next == head) {
                head = null;
            } else {
                UnitNode temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }
        UnitNode temp = head;
        UnitNode prev = null;
        do {
            prev = temp;
            temp = temp.next;
            if (temp.unitName.equals(unitName)) {
                prev.next = temp.next;
                return;
            }
        } while (temp != head);
    }

    public void displayRoute() {
        if (head == null) {
            System.out.println("No units in route");
            return;
        }
        System.out.print("Route: ");
        UnitNode temp = head;
        do {
            String status = temp.available ? "Available" : "Busy/Maintenance";
            System.out.print(temp.unitName + " (" + status + ") -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(" (back to " + head.unitName + ")");
    }
}