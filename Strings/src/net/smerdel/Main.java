package net.smerdel;

public class Main {

    public static void main(String[] args) {

//        Primitive Types
//        byte
//        short
//        int
//        long
//        float
//        double
//        char
//        boolean

        String newString = "this is a string";
        System.out.println(newString);

        newString = newString + "Now it's equal to more";
        System.out.println(newString);

        newString = newString + "Now it's equal to more";
        System.out.println(newString);

        String numString = "250.55";
        numString = numString + "49.95";
        System.out.println(numString);

        String lastString = "10";
        int newInt = 50;
        lastString = lastString + newInt;
        System.out.println("lastString = " + lastString);

    }
}
