package com.linkedlists.doublylinkedlist.texteditor;

public class TextEditorSystem {

    public static void main(String[] args) {

        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.showCurrent();   // Hello World!

        editor.undo();
        editor.showCurrent();   // Hello World

        editor.undo();
        editor.showCurrent();   // Hello

        editor.redo();
        editor.showCurrent();   // Hello World

        editor.addState("Hello World!!!"); // redo cleared
        editor.showCurrent();   // Hello World!!!
    }
}
