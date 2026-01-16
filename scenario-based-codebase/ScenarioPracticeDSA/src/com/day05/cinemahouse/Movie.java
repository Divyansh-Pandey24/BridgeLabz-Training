package com.day05.cinemahouse;
class Movie {
    String name;
    int showTime;   // time in 24 hour format, example 1430 means 2:30 PM

    Movie(String name, int showTime) {
        this.name = name;
        this.showTime = showTime;
    }

    void display() {
        System.out.println(name + " Show Time " + showTime);
    }
}
