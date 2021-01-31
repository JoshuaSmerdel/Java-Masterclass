package net.smerdel;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int day1 = (int)(r.nextInt(10));
        int day2 = (int)(r.nextInt(10));

        CheckDay.printDayOfTheWeek1(day1);
        CheckDay.printDayOfTheWeek2(day2);
    }
}
