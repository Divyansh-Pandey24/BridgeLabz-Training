package com.linkedlists.doublylinkedlist.librarymanagement;

public class LibraryLinkedList {

    BookNode head = null;
    BookNode tail = null;
    int size = 0;


    // ADD AT FIRST
    public boolean addBookAtFirst(String title, String author, String genre, int id, boolean available){

        BookNode node = new BookNode(title, author, genre, id, available);

        if(head == null){
            head = tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }

        size++;
        return true;
    }


    // ADD AT LAST
    public boolean addBookAtLast(String title, String author, String genre, int id, boolean available){

        if(head == null)
            return addBookAtFirst(title, author, genre, id, available);

        BookNode node = new BookNode(title, author, genre, id, available);

        tail.next = node;
        node.prev = tail;
        tail = node;

        size++;
        return true;
    }


    // ADD AT POSITION
    public boolean addBookAtIndex(String title, String author, String genre, int id, boolean available, int position){

        if(position < 0) return false;

        if(position == 0)
            return addBookAtFirst(title, author, genre, id, available);

        if(position >= size)
            return addBookAtLast(title, author, genre, id, available);

        BookNode node = new BookNode(title, author, genre, id, available);

        BookNode temp = head;
        int index = 0;

        while(index < position - 1){
            temp = temp.next;
            index++;
        }

        node.next = temp.next;
        node.prev = temp;

        temp.next.prev = node;
        temp.next = node;

        size++;
        return true;
    }


    // REMOVE BY BOOK ID
    public boolean removeBook(int id){

        if(head == null) return false;

        // remove head
        if(head.bookId == id){

            head = head.next;

            if(head != null)
                head.prev = null;
            else
                tail = null;

            size--;
            return true;
        }

        BookNode temp = head;

        while(temp.next != null){

            // remove tail
            if(temp.next == tail && temp.next.bookId == id){

                tail = temp;
                tail.next = null;

                size--;
                return true;
            }

            // remove middle
            if(temp.next.bookId == id){

                temp.next = temp.next.next;
                temp.next.prev = temp;

                size--;
                return true;
            }

            temp = temp.next;
        }

        return false;
    }


    // SEARCH BY TITLE
    public BookNode searchByTitle(String title){

        BookNode temp = head;

        while(temp != null){

            if(temp.title.equalsIgnoreCase(title))
                return temp;

            temp = temp.next;
        }

        return null;
    }


    // SEARCH BY AUTHOR
    public BookNode searchByAuthor(String author){

        BookNode temp = head;

        while(temp != null){

            if(temp.author.equalsIgnoreCase(author))
                return temp;

            temp = temp.next;
        }

        return null;
    }


    // UPDATE AVAILABILITY
    public boolean updateAvailability(int id, boolean status){

        BookNode temp = head;

        while(temp != null){

            if(temp.bookId == id){
                temp.isAvailable = status;
                return true;
            }

            temp = temp.next;
        }

        return false;
    }


    // DISPLAY FORWARD
    public void displayForward(){

        if(head == null){
            System.out.println("No books in the library.");
            return;
        }

        BookNode temp = head;

        while(temp != null){

            System.out.println(
                "ID: " + temp.bookId +
                " | Title: " + temp.title +
                " | Author: " + temp.author +
                " | Genre: " + temp.genre +
                " | Available: " + temp.isAvailable
            );

            temp = temp.next;
        }
    }


    // DISPLAY REVERSE
    public void displayReverse(){

        if(tail == null){
            System.out.println("No books in the library.");
            return;
        }

        BookNode temp = tail;

        while(temp != null){

            System.out.println(
                "ID: " + temp.bookId +
                " | Title: " + temp.title +
                " | Author: " + temp.author +
                " | Genre: " + temp.genre +
                " | Available: " + temp.isAvailable
            );

            temp = temp.prev;
        }
    }


    // COUNT BOOKS
    public int countBooks(){
        return size;
    }
}
