package com.day10.gamingapp;
public class Main {
    public static void main(String[] args) {

        LeaderboardAVL leaderboard = new LeaderboardAVL();

        Player p1 = new Player(1, "Alex", 1200);
        Player p2 = new Player(2, "Blake", 1800);
        Player p3 = new Player(3, "Casey", 1500);
        Player p4 = new Player(4, "Drew", 2000);

        leaderboard.insert(p1);
        leaderboard.insert(p2);
        leaderboard.insert(p3);
        leaderboard.insert(p4);

        leaderboard.displayTopPlayers(10);

        leaderboard.remove(p2);

        System.out.println();

        leaderboard.displayTopPlayers(10);
    }
}
