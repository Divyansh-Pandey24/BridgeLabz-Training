package com.linkedlists.doublylinkedlist.texteditor;

public class TextStateNode {

    String text;

    TextStateNode next;
    TextStateNode prev;

    public TextStateNode(String text){
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}
