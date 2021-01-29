package net.smerdel;

public class Main {

    public static void main(String[] args) {
        int myVal = 10_000;
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;
        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        long testLong = 100L;
        int newTotal = minVal / 2;

        long challengeNum = 50_000 + ((maxVal + maxByteVal + maxShort) * 10);


        System.out.println("min value: " + minVal);
        System.out.println("max value: " + maxVal);
        System.out.println("max byte value: " + maxByteVal);
        System.out.println("min byte value: " + minByteVal);
        System.out.println("max short value: " + minShort);
        System.out.println("min short value: " + maxShort);
        System.out.println("min Long value: " + minLong);
        System.out.println("max long value: " + maxLong);
        System.out.println(testLong);
    }
}
