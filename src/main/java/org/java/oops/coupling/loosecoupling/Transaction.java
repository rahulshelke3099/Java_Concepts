package org.java.oops.coupling.loosecoupling;

// Transaction class
public class Transaction {
    public void performTransaction(Account account, double amount) {
        // Transaction logic
        System.out.println("Transaction processed for Account Number: " + account.getAccountNumber() + ", Amount: $" + amount);
    }
}
