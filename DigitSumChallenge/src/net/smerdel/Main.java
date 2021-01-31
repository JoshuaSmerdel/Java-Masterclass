package net.smerdel;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int newVal = (int)(r.nextInt(2_000_000_000));

        sumDigits(newVal);

    }

    public static int sumDigits(int number){

        String numberToString = String.valueOf(number);
        char[] numberArray = numberToString.toCharArray();

        int sum = 0;
        int count = 0;

        if (number <= 9) {
            return -1;
        } else {
            for (int i = 0; numberArray.length > count; i++) {
                char currentNum = numberArray[i];
                int currentNumber = Character.getNumericValue(currentNum);
                System.out.println("current number: " + currentNumber);
                System.out.println(sum + " + " + currentNumber +  " = " + (sum + currentNumber));
                sum += currentNumber;

                count++;
            }
        }
        return sum;
    }
}
