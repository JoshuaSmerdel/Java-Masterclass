package net.smerdel;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("value was 2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }
//
//        int switchValue = 1;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was 3, 4 or 5");
//                break;
//            default:
//                System.out.println("was not 1, 2, 3, 4 or 5");
//                break;

        Random r = new Random();
        char charVal = (char)(r.nextInt(26) + 'a');

        switch (charVal) {
            case 'a':
                System.out.println("a was found");
                break;
            case 'b':
                System.out.println("b was found");
                break;
            case 'c':
                System.out.println("c was found");
                break;
            case 'd':
                System.out.println("d was found");
                break;
            case 'e':
                System.out.println("e was found");
                break;
            default:
                System.out.println("a, b, c, d or e was not found");
                break;
        }

        String month = "march";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("January was found");
                break;
            case "february":
                System.out.println("February was found");
                break;
            case "march":
                System.out.println("March was found");
                break;
            case "april":
                System.out.println("April was found");
                break;
            case "may":
                System.out.println("May was found");
                break;
            default:
                System.out.println(month + " was not found");
                break;
        }
    }
}
