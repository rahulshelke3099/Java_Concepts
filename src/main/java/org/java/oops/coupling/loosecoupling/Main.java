package org.java.oops.coupling.loosecoupling;

// Main class
public class Main {
    public static void main(String[] args) {
        Account account = new Account("ACC123456", 1000.00);
        Transaction transaction = new Transaction();
        transaction.performTransaction(account, 200.00);
    }
}
