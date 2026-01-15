package com.day04.smartshelf;
class SmartShelf {

 
    public static void sortBooks(Book[] books, int size) {

        for (int i = 1; i < size; i++) {
            Book key = books[i];
            int j = i - 1;

            // Move larger titles one position ahead
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void display(Book[] books, int size) {
        for (int i = 0; i < size; i++) {
            books[i].display();
        }
    }
}
