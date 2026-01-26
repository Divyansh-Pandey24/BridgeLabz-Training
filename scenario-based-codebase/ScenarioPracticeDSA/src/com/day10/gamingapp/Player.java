package com.day10.gamingapp;
public class Player {
    private int playerId;
    private String name;
    private int score;

    public Player(int playerId, String name, int score) {
        this.playerId = playerId;
        this.name = name;
        this.score = score;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ID: " + playerId + ", Name: " + name + ", Score: " + score;
    }
}
