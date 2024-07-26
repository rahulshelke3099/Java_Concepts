package org.java.oops.aggregation;

public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("ABC Bank");

        // Create branches and add them to the bank
        Branch branch1 = new Branch("Main Branch");
        Branch branch2 = new Branch("Downtown Branch");

        bank.addBranch(branch1);
        bank.addBranch(branch2);

        // Output bank details
        System.out.println("Bank: " + bank.getName());
        System.out.println("Branches:");
        for (Branch branch : bank.getBranches()) {
            System.out.println("- " + branch.getName());
        }
    }
}
