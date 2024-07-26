package org.java.oops.composition;

// Account class
public class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Other methods related to account operations
}
