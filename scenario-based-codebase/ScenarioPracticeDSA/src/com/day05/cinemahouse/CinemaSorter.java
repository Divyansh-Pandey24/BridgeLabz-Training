package com.day05.cinemahouse;
class CinemaSorter {

    public static void bubbleSort(Movie[] movies) {

        int n = movies.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (movies[j].showTime > movies[j + 1].showTime) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
        }
    }
}
