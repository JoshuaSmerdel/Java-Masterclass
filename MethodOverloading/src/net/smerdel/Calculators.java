package net.smerdel;

public class Calculators {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        boolean ftZero = feet < 0;
        boolean inZero = inches < 0;
        double inConvert = inches * 2.54;
        double ftConvert = (feet * 12) * 2.54;
        double centimeters = inConvert + ftConvert;

        if (ftZero || inZero){
            return -1;
        } else {
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        boolean inZero = inches < 0;

        if (inZero){
            return -1;
        } else {
            return calcFeetAndInchesToCentimeters(0, inches);
        }
    }

    public static int calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1_000;
    }

    public static int calculateScore(int score){

        System.out.println("Unnamed player " + " scored " + score + " points");
        return score * 1_000;
    }

    public static int calculateScore(){

        System.out.println("No player name, no player score");
        return 0;
    }
}
