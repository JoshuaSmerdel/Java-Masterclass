package net.smerdel;

import UserInput.Input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] usersNumbers = new int[10];
        int count = 1;
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        while (count <= 10){
            System.out.println("Enter number #" + count + ":");
            count++;
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                usersNumbers[index] = scanner.nextInt();
                index++;
            } else {
                System.out.println("Invalid Entry, please try entering a number again.");
            }
        }

        scanner.close();
        System.out.print("The sum of all of your numbers is: ");
        System.out.println(Input.sumOfTen(usersNumbers));
    }
}
