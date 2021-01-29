package net.smerdel;

public class Main {

    public static void main(String[] args) {
	    double pounds = 267;
        double conversionRatio = .45359237;
        double convertedKilos = pounds * conversionRatio;

        System.out.println(pounds + " pounds = " + convertedKilos + " kilograms");

    }
}
