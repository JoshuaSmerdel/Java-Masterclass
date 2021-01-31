package net.smerdel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        boolean hasNextInt = scanner.hasNextInt();
        int age = 0;

        if (hasNextInt == true){
            int yearOfBirth = scanner.nextInt();
            age = 2020 - yearOfBirth;
            if (age >= 0 && age <=150){
                System.out.println("your age is " + age);
            } else {
                System.out.println("Invalid Entry");
            }
        } else {
            System.out.println("Please enter a valid year of birth");
        }
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);





        scanner.close();

    }
}
