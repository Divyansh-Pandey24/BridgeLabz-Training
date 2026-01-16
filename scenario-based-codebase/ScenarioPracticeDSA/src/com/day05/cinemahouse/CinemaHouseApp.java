package com.day05.cinemahouse;
public class CinemaHouseApp {

    public static void main(String[] args) {

        Movie[] movies = {
            new Movie("Morning Show", 930),
            new Movie("Matinee", 1230),
            new Movie("Evening Show", 1800),
            new Movie("Noon Show", 1100),
            new Movie("Night Show", 2130)
        };

        System.out.println("Before Sorting");
        for (Movie m : movies) {
            m.display();
        }

        CinemaSorter.bubbleSort(movies);

        System.out.println("\nAfter Sorting by Show Time");
        for (Movie m : movies) {
            m.display();
        }
    }
}
