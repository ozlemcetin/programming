package org.example.chapter06;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    /*
    ===
     */

    public BankAccount() {

        //we may call another constructor with default values
        this("-1", 0d, "default name", "default email", "default phone");
        System.out.println("Empty constructor is called.");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;

        System.out.println("Constructor with parameters called.");
    }

    /*
        ===
         */
    public void deposit(double amount) {
        if (amount > 0d) {
            this.balance += amount;
            System.out.println("Deposit  of " + amount + " made. New balance is " + this.balance);
        } else {
            System.out.println("Invalid amount. Deposit  of " + amount + " not made.");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0d && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal  of " + amount + " processed. Remaining balance is " + this.balance);
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal  of " + amount + " not processed.");
        }
    }

    /*
    ===
     */

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
