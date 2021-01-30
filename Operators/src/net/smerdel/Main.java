package net.smerdel;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("result = " + result);
        int prevResult = result;
        System.out.println("result = " + result);
        System.out.println("prevResult = " + prevResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("result = " + result);
        System.out.println("prevResult = " + prevResult);
        result = result * 10;
        System.out.println("result = " + result);
        System.out.println("prevResult = " + prevResult);
        result = result / 5; // 20 / 5 = 4
        System.out.println("result = " + result);
        result = result % 3; // remainder of 4 / 3
        System.out.println("result = " + result);

        boolean isAlien = true;

//        if-then statement
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        int secondScore = 95;
        if ((topScore <= 100) && (topScore > 80)) {
            System.out.println("You got the high score");
        } else {
            System.out.println("you suck");
        }

        if ((topScore > 90) || (secondScore <= 90)) {
            System.out.println("either or both of the conditions are true");
        }

        int newVal = 5;
        if (newVal == 50) {
            System.out.println("This is an not !error");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("this is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;

        double newDub20 = 20.00;
        double newDub80 = 80;
        double newDubVal = (newDub20 + newDub80) * 100;
        System.out.println(newDubVal);
        double newDubVal2 = newDubVal % 40;
        System.out.println(newDubVal2);

        boolean isZero =  newDubVal2 == 0 ? true : false;
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("got some remainder");
        }
    }
}
