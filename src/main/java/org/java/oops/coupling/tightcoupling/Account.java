package org.java.oops.coupling.tightcoupling;


// Account class
public class Account {
    private String accountNumber;
    private double balance;
    private Transaction transaction; // Coupling introduced

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transaction = new Transaction(); // Coupling introduced
    }

    public void performTransaction(double amount) {
        transaction.processTransaction(this, amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

