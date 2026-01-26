package com.day9.musicapp;
public class Main {
    public static void main(String[] args) {

        MusicLibrary library = new MusicLibrary();

        library.addSong(new Song(101, "Believer", "Imagine Dragons"));
        library.addSong(new Song(102, "Closer", "The Chainsmokers"));
        library.addSong(new Song(103, "Demons", "Imagine Dragons"));

        System.out.println(library.searchByTrackId(102));

        library.displaySongsAlphabetically();
    }
}
