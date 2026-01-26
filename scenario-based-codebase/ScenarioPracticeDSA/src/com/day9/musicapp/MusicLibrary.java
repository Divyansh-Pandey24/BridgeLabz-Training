package com.day9.musicapp;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MusicLibrary {

    private Map<Integer, Song> trackMap;
    private TreeMap<String, Song> titleMap;

    public MusicLibrary() {
        trackMap = new HashMap<>();
        titleMap = new TreeMap<>();
    }

    public void addSong(Song song) {
        trackMap.put(song.getTrackId(), song);
        titleMap.put(song.getTitle(), song);
    }

    public Song searchByTrackId(int trackId) {
        return trackMap.get(trackId);
    }

    public void displaySongsAlphabetically() {
        for (Song song : titleMap.values()) {
            System.out.println(song);
        }
    }
}
