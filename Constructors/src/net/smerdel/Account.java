package net.smerdel;

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        this("56789", 2.50, "Default Name","Default Email", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("Constructor with parameters called");
    }
//
//    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone){
//
//        this.accountNumber;
//        this
//
//    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println(" Deposit of " + depositAmount + " made. " + this.customerName + "'s balance = " + this.balance);
    }

    public void withdrawal (double withdrawalAmount){
        if (balance - withdrawalAmount <0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed." + this.customerName + "'s balance = " + balance);
        }
    }

    public String getAccountNUmber() {
        return accountNumber;
    }

    public void setAccountNUmber(String accountNUmber) {
        this.accountNumber = accountNUmber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
