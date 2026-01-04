package com.linkedlists.singlylinkedlist.inventorymanagementsystem;

public class InventoryLinkedList {

    ItemNode head = null;
    ItemNode tail = null;
    int size = 0;


    // ADD AT FIRST
    public boolean addItemAtFirst(String name, int id, int qty, double price){

        ItemNode node = new ItemNode(name, id, qty, price);

        node.next = head;
        head = node;

        if(tail == null)
            tail = head;

        size++;
        return true;
    }


    // ADD AT LAST
    public boolean addItemAtLast(String name, int id, int qty, double price){

        if(head == null)
            return addItemAtFirst(name, id, qty, price);

        ItemNode node = new ItemNode(name, id, qty, price);

        tail.next = node;
        tail = node;

        size++;
        return true;
    }


    // ADD AT POSITION
    public boolean addItemAtIndex(String name, int id, int qty, double price, int position){

        if(position < 0) return false;

        if(position == 0)
            return addItemAtFirst(name, id, qty, price);

        if(position >= size)
            return addItemAtLast(name, id, qty, price);

        ItemNode node = new ItemNode(name, id, qty, price);

        ItemNode temp = head;
        int index = 0;

        while(index < position - 1){
            temp = temp.next;
            index++;
        }

        node.next = temp.next;
        temp.next = node;

        size++;
        return true;
    }


    // REMOVE BY ID
    public boolean removeItem(int id){

        if(head == null) return false;

        if(head.itemId == id){

            head = head.next;

            if(head == null)
                tail = null;

            size--;
            return true;
        }

        ItemNode temp = head;

        while(temp.next != null){

            if(temp.next == tail && temp.next.itemId == id){

                tail = temp;
                temp.next = null;

                size--;
                return true;
            }

            if(temp.next.itemId == id){

                temp.next = temp.next.next;

                size--;
                return true;
            }

            temp = temp.next;
        }

        return false;
    }


    // UPDATE QUANTITY
    public boolean updateQuantity(int id, int newQty){

        ItemNode temp = head;

        while(temp != null){

            if(temp.itemId == id){
                temp.quantity = newQty;
                return true;
            }

            temp = temp.next;
        }

        return false;
    }


    // SEARCH BY ID
    public ItemNode searchById(int id){

        ItemNode temp = head;

        while(temp != null){

            if(temp.itemId == id)
                return temp;

            temp = temp.next;
        }

        return null;
    }


    // SEARCH BY NAME
    public ItemNode searchByName(String name){

        ItemNode temp = head;

        while(temp != null){

            if(temp.itemName.equalsIgnoreCase(name))
                return temp;

            temp = temp.next;
        }

        return null;
    }


    // TOTAL INVENTORY VALUE
    public double totalInventoryValue(){

        double sum = 0;

        ItemNode temp = head;

        while(temp != null){

            sum += temp.price * temp.quantity;
            temp = temp.next;
        }

        return sum;
    }


    // DISPLAY INVENTORY
    public void displayInventory(){

        if(head == null){
            System.out.println("Inventory is empty.");
            return;
        }

        ItemNode temp = head;

        while(temp != null){

            System.out.println(
                temp.itemName + " | ID: " + temp.itemId +
                " | Qty: " + temp.quantity +
                " | Price: " + temp.price
            );

            temp = temp.next;
        }
    }


    // SORT BY NAME (ASC)
    public void sortByNameAscending(){

        if(head == null) return;

        for(ItemNode i = head; i != null; i = i.next){

            for(ItemNode j = i.next; j != null; j = j.next){

                if(i.itemName.compareToIgnoreCase(j.itemName) > 0){

                    String tn = i.itemName;
                    i.itemName = j.itemName;
                    j.itemName = tn;

                    int ti = i.itemId;
                    i.itemId = j.itemId;
                    j.itemId = ti;

                    int tq = i.quantity;
                    i.quantity = j.quantity;
                    j.quantity = tq;

                    double tp = i.price;
                    i.price = j.price;
                    j.price = tp;
                }
            }
        }
    }


    // SORT BY PRICE (ASC)
    public void sortByPriceAscending(){

        if(head == null) return;

        for(ItemNode i = head; i != null; i = i.next){

            for(ItemNode j = i.next; j != null; j = j.next){

                if(i.price > j.price){

                    String tn = i.itemName;
                    i.itemName = j.itemName;
                    j.itemName = tn;

                    int ti = i.itemId;
                    i.itemId = j.itemId;
                    j.itemId = ti;

                    int tq = i.quantity;
                    i.quantity = j.quantity;
                    j.quantity = tq;

                    double tp = i.price;
                    i.price = j.price;
                    j.price = tp;
                }
            }
        }
    }
}
