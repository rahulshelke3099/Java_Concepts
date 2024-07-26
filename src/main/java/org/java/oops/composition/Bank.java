package org.java.oops.composition;

/**
 * Composition is suitable for this example because:
 * <p>
 * Each Account object is an essential part of the Bank.
 * The lifecycle of Account objects is managed by the Bank.
 * When the Bank is destroyed, all associated Account objects are also destroyed.
 * This example demonstrates how composition is used in Java to model a strong "whole-part"
 * relationship between classes, where the "whole" (the Bank) owns and manages the "part" (the Account).
 */

import java.util.ArrayList;
import java.util.List;

// Bank class
public class Bank {
    private String name;
    private List<Account> accounts;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to get total balance of all accounts
    public double getTotalBalance() {
        double totalBalance = 0;
        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    // Other methods related to bank operations
}

