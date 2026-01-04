package com.linkedlists.singlylinkedlist.inventorymanagementsystem;

public class InventorySystem {

    public static void main(String[] args) {

        InventoryLinkedList list = new InventoryLinkedList();

        list.addItemAtFirst("Laptop", 101, 5, 50000);
        list.addItemAtLast("Mouse", 102, 20, 500);
        list.addItemAtIndex("Keyboard", 103, 10, 1500, 1);

        System.out.println("\nInventory:");
        list.displayInventory();

        list.updateQuantity(102, 25);

        list.removeItem(103);

        System.out.println("\nAfter Updates:");
        list.displayInventory();

        System.out.println("\nTotal Inventory Value: " + list.totalInventoryValue());

        list.sortByNameAscending();

        System.out.println("\nSorted By Name:");
        list.displayInventory();
    }
}
