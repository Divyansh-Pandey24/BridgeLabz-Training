package com.linkedlists.doublylinkedlist.texteditor;

public class TextEditorHistory {

    TextStateNode head = null;
    TextStateNode tail = null;

    TextStateNode current = null;   // current editor state

    int size = 0;
    final int MAX_HISTORY = 10;


    // ADD NEW STATE (LIKE TYPING)
    public void addState(String newText){

        TextStateNode node = new TextStateNode(newText);

        // If redo states exist → delete them
        if(current != tail && current != null){

            TextStateNode temp = current.next;
            while(temp != null){
                size--;
                temp = temp.next;
            }

            current.next = null;
            tail = current;
        }

        // First state
        if(head == null){
            head = tail = current = node;
        }
        else{

            tail.next = node;
            node.prev = tail;
            tail = node;
            current = node;
        }

        size++;

        enforceLimit();
    }


    // LIMIT HISTORY TO LAST 10 STATES
    private void enforceLimit(){

        while(size > MAX_HISTORY){

            head = head.next;
            head.prev = null;
            size--;
        }
    }


    // UNDO — MOVE TO PREVIOUS STATE
    public void undo(){

        if(current != null && current.prev != null){
            current = current.prev;
        }
        else{
            System.out.println("No more undo available.");
        }
    }


    // REDO — MOVE TO NEXT STATE
    public void redo(){

        if(current != null && current.next != null){
            current = current.next;
        }
        else{
            System.out.println("No more redo available.");
        }
    }


    // DISPLAY CURRENT STATE
    public void showCurrent(){

        if(current == null)
            System.out.println("Editor empty.");
        else
            System.out.println("Current Text: " + current.text);
    }
}
