package net.smerdel;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        System.out.println("-----------------------------------------------");

        while (count != 6) {
            System.out.println("count value is " + count);
            count ++;
        }

        System.out.println("-----------------------------------------------");

        count = 1;

        for (count = 1; count != 6; count ++){
            System.out.println("count value is " + count);
        }

        System.out.println("-----------------------------------------------");

        count = 1;

        do {
            System.out.println("count value is " + count);
            count++;
        } while (count != 6);

        System.out.println("-----------------------------------------------");

        Random r = new Random();
        count = 0;
        int foundEven = 0;

        while (count <= 100) {
            if (isEvenNumber(count) == false){
                count++;
            } else {
                System.out.println(count + " is even");
                count++;
                foundEven++;
            }
            if (foundEven >= 5){
                break;
            } else {
                continue;
            }

        }


    }

    public static boolean isEvenNumber(int value){

        if (value % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
