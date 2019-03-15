package com.HaydenRust;

public class Main {

    public static void main(String[] args) {
        int playerRank = calculateHighScorePosition(1500);
        displayHighScorePosition("Hayden", playerRank);

        playerRank = calculateHighScorePosition(900);
        displayHighScorePosition("Josh", playerRank);

        playerRank = calculateHighScorePosition(400);
        displayHighScorePosition("Em", playerRank);

        playerRank = calculateHighScorePosition(50);
        displayHighScorePosition("Joel", playerRank);
    }

    public static void displayHighScorePosition(String playerName, int playerRank) {
        System.out.println(playerName + " managed to get into position "
                + playerRank + " on the high score table ");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }
}

