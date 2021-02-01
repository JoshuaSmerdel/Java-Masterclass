package net.smerdel;

public class Main {

    public static void main(String[] args) {

        Ford vin12345 = new Ford("Sedan", "Focus", "2012", "Gasoline", "v4", 5, 20000, 0);

        System.out.println(vin12345);
        System.out.println(vin12345.getMake() + " " + vin12345.getModel() + " Current Speed: " + vin12345.getCurrentSpeed());
        vin12345.upShifting();
        System.out.println(vin12345.getMake() + " " + vin12345.getModel() + " Current Speed: " + vin12345.getCurrentSpeed());





    }
}
