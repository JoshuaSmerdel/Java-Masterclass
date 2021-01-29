package net.smerdel;

public class Main {

    public static void main(String[] args) {
	byte byteVal1 = 10;
	short shortVal1 = 20;
	int intVal1 = 50;
	long longVal1 = 50_000L + 10L * (byteVal1 + shortVal1 + intVal1);

	System.out.println(longVal1);

    }
}
