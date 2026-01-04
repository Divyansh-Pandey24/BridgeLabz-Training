package com.linkedlists.doublylinkedlist.moviemanagement;

public class MovieManagement {

    public static void main(String[] args) {

        MovieLinkedList list = new MovieLinkedList();

        list.addMovieAtFirst("Inception", "Nolan", 2010, 9.0);
        list.addMovieAtLast("Avatar", "Cameron", 2009, 8.5);
        list.addMovieAtIndex("Interstellar", "Nolan", 2014, 9.2, 1);

        System.out.println("\nMovies (Forward):");
        list.displayForward();

        System.out.println("\nMovies (Reverse):");
        list.displayReverse();

        list.updateRating("Avatar", 9.0);

        list.removeMovie("Inception");

        System.out.println("\nFinal List:");
        list.displayForward();
    }
}
