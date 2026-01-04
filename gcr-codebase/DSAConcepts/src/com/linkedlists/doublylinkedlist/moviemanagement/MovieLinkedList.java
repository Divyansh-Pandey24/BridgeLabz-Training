package com.linkedlists.doublylinkedlist.moviemanagement;

public class MovieLinkedList {

    MovieNode head = null;
    MovieNode tail = null;
    int size = 0;


    // INSERT AT FIRST
    public boolean addMovieAtFirst(String title, String director, int year, double rating){

        MovieNode node = new MovieNode(title, director, year, rating);

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


    // INSERT AT LAST
    public boolean addMovieAtLast(String title, String director, int year, double rating){

        if(head == null){
            return addMovieAtFirst(title, director, year, rating);
        }

        MovieNode node = new MovieNode(title, director, year, rating);

        tail.next = node;
        node.prev = tail;
        tail = node;

        size++;
        return true;
    }


    // INSERT AT GIVEN POSITION
    public boolean addMovieAtIndex(String title, String director, int year, double rating, int position){

        if(position < 0) return false;

        if(position == 0)
            return addMovieAtFirst(title, director, year, rating);

        if(position >= size)
            return addMovieAtLast(title, director, year, rating);

        MovieNode node = new MovieNode(title, director, year, rating);

        MovieNode temp = head;
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


    // DELETE BY TITLE
    public boolean removeMovie(String title){

        if(head == null) return false;

        // delete head
        if(head.title.equals(title)){

            head = head.next;

            if(head != null)
                head.prev = null;
            else
                tail = null;

            size--;
            return true;
        }

        MovieNode temp = head;

        while(temp.next != null){

            // delete tail
            if(temp.next == tail && temp.next.title.equals(title)){

                tail = temp;
                tail.next = null;

                size--;
                return true;
            }

            // delete middle
            if(temp.next.title.equals(title)){

                temp.next = temp.next.next;
                temp.next.prev = temp;

                size--;
                return true;
            }

            temp = temp.next;
        }

        return false;
    }


    // SEARCH BY DIRECTOR
    public void searchByDirector(String director){

        MovieNode temp = head;
        boolean found = false;

        while(temp != null){

            if(temp.director.equals(director)){
                System.out.println(temp.title + " (" + temp.year + ") Rating: " + temp.rating);
                found = true;
            }

            temp = temp.next;
        }

        if(!found)
            System.out.println("No movies found for director: " + director);
    }


    // SEARCH BY RATING
    public void searchByRating(double rating){

        MovieNode temp = head;
        boolean found = false;

        while(temp != null){

            if(temp.rating == rating){
                System.out.println(temp.title + " (" + temp.year + ")");
                found = true;
            }

            temp = temp.next;
        }

        if(!found)
            System.out.println("No movies with rating: " + rating);
    }


    // UPDATE RATING BY TITLE
    public boolean updateRating(String title, double newRating){

        MovieNode temp = head;

        while(temp != null){

            if(temp.title.equals(title)){
                temp.rating = newRating;
                return true;
            }

            temp = temp.next;
        }

        return false;
    }


    // DISPLAY FORWARD
    public void displayForward(){

        if(head == null){
            System.out.println("No movies in the list.");
            return;
        }

        MovieNode temp = head;

        while(temp != null){

            System.out.println(
                temp.title + " | " + temp.director +
                " | " + temp.year + " | Rating: " + temp.rating
            );

            temp = temp.next;
        }
    }


    // DISPLAY REVERSE
    public void displayReverse(){

        if(tail == null){
            System.out.println("No movies in the list.");
            return;
        }

        MovieNode temp = tail;

        while(temp != null){

            System.out.println(
                temp.title + " | " + temp.director +
                " | " + temp.year + " | Rating: " + temp.rating
            );

            temp = temp.prev;
        }
    }
}
