package net.smerdel;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        double doubleMph = kilometersPerHour * 0.62137119223733;
        long mph = Math.round(doubleMph);

        if (kilometersPerHour < 0){
            return -1;
        } else {
            return mph;
        }
    }

    public static void printConversion(double kilometersPerHour){

        long mph = toMilesPerHour(kilometersPerHour);
        String kphString = kilometersPerHour + " km/h = ";
        String mphString = mph + " mi/h";

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kphString + mphString);
        }
    }
}
