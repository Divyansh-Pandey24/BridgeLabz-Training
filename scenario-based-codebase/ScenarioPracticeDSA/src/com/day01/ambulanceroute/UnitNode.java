package com.day01.ambulanceroute;
public class UnitNode {
    String unitName;
    boolean available;
    UnitNode next;

    public UnitNode(String unitName) {
        this.unitName = unitName;
        this.available = true;
        this.next = null;
    }
}