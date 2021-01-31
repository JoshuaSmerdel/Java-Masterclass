package net.smerdel;

import java.util.Currency;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
                count ++;
                System.out.println("Sum = " + sum);
                if (count >= 5) {
                    break;
                }
            }
        }

//        for (double i = 2; i <= 8.00; i++) {
//            System.out.println("10,000 at " + i + "% interest = $" + calculateInterest(10000, i));
//        }
//
//        System.out.println("_____________________________________________________________________________");
//        System.out.println();
//
//        for (double i = 8; i >= 2; i--) {
//            System.out.println("10,000 at " + i + "% interest = $" + calculateInterest(10000, i));
//        }
//        int numberOfPrimes = 0;
//
//        for (int i = 0; i <= 10000; i++) {
//            if (isPrime(i)){
//                numberOfPrimes ++;
//                System.out.println(i + " is Prime. number of Primes found: " + numberOfPrimes);
//                if (numberOfPrimes >= 1000){
//                    break;
//                }
//            }
//        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        double interest = interestRate * 0.01;

        return (amount * interest) + amount;
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}