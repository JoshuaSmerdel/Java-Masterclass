package net.smerdel;

public class Main {

    public static void main(String[] args) {

//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was: " + highScore);
//
//        highScore = calculateScore(true, 10_000, 8, 200);
//        System.out.println("Your final score was: " + highScore);
//
//        highScore = calculateScore(false, 5_000, 4, 50);
//        System.out.println("Your final score was: " + highScore);

        int brookeScore = 1500;
        int masonScore = 900;
        int azaScore = 400;
        int joshScore = 50;

        int brookeRank = calculateHighScorePosition(brookeScore);
        int masonRank = calculateHighScorePosition(masonScore);
        int azaRank = calculateHighScorePosition(azaScore);
        int joshRank = calculateHighScorePosition(joshScore);

        displayHighScorePosition("Brooke", brookeRank);
        displayPlayersScore(brookeScore);
        displayHighScorePosition("Mason", masonRank);
        displayPlayersScore(masonScore);
        displayHighScorePosition("Aza", azaRank);
        displayPlayersScore(azaScore);
        displayHighScorePosition("Joshua", joshRank);
        displayPlayersScore(joshScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2_000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int scoreRank){

        System.out.print(playersName + " is in position: " + scoreRank + " on the high scores list");
    }

    public static void displayPlayersScore(int playersScore){

        System.out.println(" with a score of " + playersScore);
    }

    public static int calculateHighScorePosition(int playersScore){

        if (playersScore >= 1000){
            return 1;
        } else if (playersScore >= 500){
            return 2;
        } else if (playersScore >= 100){
            return 3;
        } else {
            return 4;
        }
    }
}
