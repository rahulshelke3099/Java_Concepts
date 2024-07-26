package org.java.oops.coupling.tightcoupling;

// Transaction class
public class Transaction {
    public void processTransaction(Account account, double amount) {
        // Transaction logic
        System.out.println("Transaction processed for Account Number: " + account.getAccountNumber() + ", Amount: $" + amount);
    }
}
