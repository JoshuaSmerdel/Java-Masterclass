package net.smerdel;

public class Main {

    public static void main(String[] args) {

        Account joshAccount = new Account("12345", 1000, "Joshua Smerdel", "josh@smerdel.net", "4402634967");


        joshAccount.withdrawal(100);


        joshAccount.deposit(50);
        joshAccount.withdrawal(100);
        joshAccount.withdrawal(15);

        joshAccount.deposit(50);
        joshAccount.deposit(50);

        joshAccount.withdrawal(100);

        VipCustomer johnSmith = new VipCustomer("John Smith", 5000, "johnsmith@aol.com");

        System.out.println(johnSmith.getCreditLimit());
    }
}
