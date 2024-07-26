package org.java.oops.inheritance;

/***
 *
 *
 Inheritance in Java is a fundamental concept of object-oriented programming (OOP) that allows
 one class to inherit the fields and methods of another class. The class that is inherited from
 is called the parent or superclass, and the class that inherits is called the child or subclass.
 Inheritance promotes code reuse and establishes a natural hierarchy between classes.

 Key Concepts of Inheritance
 Superclass (Parent Class): The class whose properties and methods are inherited.
 Subclass (Child Class): The class that inherits the properties and methods of another class.
 extends Keyword: Used to declare inheritance. A subclass extends a superclass.
 Method Overriding: A subclass can provide a specific implementation for a method that is already defined in its superclass.
 Access Modifiers: Control the visibility of class members (fields and methods). private members are not inherited, while protected and public members are accessible to subclasses.
 Banking Example
 Consider a banking application with different types of bank accounts.
 We can create a superclass BankAccount that defines common properties and behaviors of all
 bank accounts, and then create subclasses like SavingsAccount and CheckingAccount that inherit
 from BankAccount and add specific features.
 *
 *
 *
 *
 * Inheritance in Java is crucial for several reasons, primarily because it promotes code reuse,
 * organizes code logically, and supports polymorphism. Here are some key reasons for the need for
 * inheritance in Java:
 *
 * 1. Code Reusability
 * Inheritance allows a class to use methods and fields of another class without having to rewrite the code.
 * This means that common functionalities can be defined once in a superclass and reused in multiple subclasses.
 *
 * Example: If multiple types of bank accounts share common properties like account number and balance, and methods like deposit and withdraw, defining these in a superclass (BankAccount) allows all subclasses (SavingsAccount, CheckingAccount) to inherit and reuse this code.
 *
 * 2. Logical Organization
 * Inheritance helps in logically structuring the code by establishing a hierarchical relationship between classes. This makes the code easier to understand and maintain.
 *
 * Example: In a banking system, it is logical to have a general BankAccount class from which more specific account types (e.g., SavingsAccount, CheckingAccount) inherit. This reflects the real-world relationship between different account types.
 *
 * 3. Polymorphism
 * Inheritance supports polymorphism, allowing a single interface to represent different underlying forms (data types). This means you can write code that works on the superclass type, and it will automatically work with any subclass type.
 *
 * Example: A method that processes bank accounts can be written to accept a BankAccount parameter. This method will then work with any object of a subclass of BankAccount, such as SavingsAccount or CheckingAccount.
 *
 * java
 * Copy code
 * public void processAccount(BankAccount account) {
 *     account.deposit(100);
 *     System.out.println("Processed account: " + account.getAccountNumber());
 * }
 * 4. Method Overriding
 * Inheritance allows subclasses to provide specific implementations for methods that are defined in the superclass. This is known as method overriding and is essential for runtime polymorphism.
 *
 * Example: The withdraw method in the BankAccount class can be overridden in the CheckingAccount class to implement overdraft logic specific to checking accounts.
 *
 * java
 * Copy code
 * @Override
 * public void withdraw(double amount) {
 *     if (amount > 0 && (balance + overdraftLimit) >= amount) {
 *         balance -= amount;
 *         System.out.println("Withdrew: " + amount);
 *     } else {
 *         System.out.println("Insufficient funds or invalid amount.");
 *     }
 * }
 * 5. Ease of Maintenance
 * By centralizing common code in a superclass, changes and bug fixes need to be made only once in the superclass rather than in each subclass. This makes the code easier to maintain and reduces the risk of errors.
 *
 * Example: If a bug is found in the deposit method, fixing it in the BankAccount class automatically fixes the issue for all types of accounts that inherit from it.
 *
 * 6. Extensibility
 * Inheritance allows for the easy extension of existing code. New functionalities can be added by creating new subclasses without modifying existing classes.
 *
 * Example: If a new type of account (e.g., BusinessAccount) is introduced, it can inherit from BankAccount and add its specific features without altering the existing BankAccount, SavingsAccount, or CheckingAccount classes.
 *
 * java
 * Copy code
 * public class BusinessAccount extends BankAccount {
 *     private double transactionLimit;
 *
 *     public BusinessAccount(String accountNumber, double initialBalance, double transactionLimit) {
 *         super(accountNumber, initialBalance);
 *         this.transactionLimit = transactionLimit;
 *     }
 *
 *     // Additional methods specific to BusinessAccount
 * }
 * Conclusion
 * Inheritance in Java is a powerful feature that provides significant benefits,
 * including code reuse, logical organization, polymorphism, method overriding, ease of maintenance, and extensibility. It allows developers to create flexible and modular systems by building upon existing code, leading to more efficient and manageable applications.
 *
 */

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
