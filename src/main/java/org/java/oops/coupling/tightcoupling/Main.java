package org.java.oops.coupling.tightcoupling;

// Main class
/**
Dependency Introduced:
In the second scenario, a direct dependency is introduced between the Account and Transaction classes.
The Account class instantiates the Transaction class internally, creating a tight coupling between the two components.
Increased Complexity:
The system becomes more complex due to the interdependency between classes.
Modifications to one class may require changes in the other class, leading to increased development time and effort.
Reduced Reusability:
The tightly coupled design limits the reusability of individual components.
For example, if you want to reuse the Transaction logic in a different context, you cannot do so without also bringing along the Account dependency.
Difficulty in Maintenance:
Maintenance becomes challenging as changes in one class may have unintended consequences on the functionality of the other class.
For instance, if you need to update the Transaction logic, you must ensure that it does not break the functionality of the Account class, and vice versa.
**/
 public class Main {
    public static void main(String[] args) {
        Account account = new Account("ACC123456", 1000.00);
        account.performTransaction(200.00); // Transaction processing moved to Account class
    }
}
