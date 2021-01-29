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
    }
}
