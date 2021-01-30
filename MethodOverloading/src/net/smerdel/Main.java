package net.smerdel;

public class Main {

    public static void main(String[] args) {


        double newCentimeterVal1 = Calculators.calcFeetAndInchesToCentimeters(12, 0);
        double newCentimeterVal2 = Calculators.calcFeetAndInchesToCentimeters(144);

        System.out.println(newCentimeterVal1);
        System.out.println(newCentimeterVal2);


        int newScore = Calculators.calculateScore("Joshua", 500);
        System.out.println("New score is " + newScore);
        Calculators.calculateScore(75);
        Calculators.calculateScore();
    }


}
