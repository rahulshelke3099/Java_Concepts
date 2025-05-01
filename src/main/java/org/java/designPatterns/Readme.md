Design Patterns in Java – In-Depth Explanation with Code Examples

What are Design Patterns?
Design patterns are proven solutions to common software design problems. 
They help improve code maintainability, reusability, and scalability.

Types of Design Patterns
Design patterns are categorized into three main types:

Type	Purpose
Creational Patterns	Deal with object creation mechanisms, improving flexibility and reusability.
Structural Patterns	Focus on class composition to form larger structures efficiently.
Behavioral Patterns	Define how objects interact and communicate

Singleton Pattern – Ensures only one instance of a class exists.
When to Use?
Logging, database connections, caching, thread pools.


Factory Pattern – Provides an interface for creating objects.
When to Use?
When the exact type of object to be created is determined at runtime.

Factory Pattern
Definition:
Provides an interface for creating objects.
Returns a single product type based on input.
Helps avoid direct instantiation using new.
Example in Banking (Factory Pattern)
📌 Use Case: Creating Different Types of Loans (Home Loan, Car Loan, Personal Loan).

java
Copy
Edit
// Step 1: Create an Interface
interface Loan {
void getInterestRate();
}

// Step 2: Concrete Classes Implementing the Interface
class HomeLoan implements Loan {
public void getInterestRate() {
System.out.println("Home Loan Interest Rate: 6.5%");
}
}

class CarLoan implements Loan {
public void getInterestRate() {
System.out.println("Car Loan Interest Rate: 7.2%");
}
}

// Step 3: Factory Class to Return Loan Type
class LoanFactory {
public static Loan getLoan(String loanType) {
if (loanType.equalsIgnoreCase("home")) return new HomeLoan();
else if (loanType.equalsIgnoreCase("car")) return new CarLoan();
return null;
}
}

// Step 4: Usage
public class FactoryPatternBankExample {
public static void main(String[] args) {
Loan loan1 = LoanFactory.getLoan("home");
loan1.getInterestRate();

        Loan loan2 = LoanFactory.getLoan("car");
        loan2.getInterestRate();
    }
}
Output:
yaml
Copy
Edit
Home Loan Interest Rate: 6.5%
Car Loan Interest Rate: 7.2%
Key Points of Factory Pattern:
✅ Simple Factory, returns one type of object (Loan).
✅ Client only requests an object, the factory handles instantiation.
✅ Good for managing related objects with minimal variations.


Abstract Factory Pattern
Definition:
Factory of Factories → Produces multiple related product families.
Each factory creates different types of related objects.
Used when multiple related classes need to be created dynamically.
Example in Banking (Abstract Factory Pattern)
📌 Use Case: Creating Both Loans and Bank Accounts Using Abstract Factory.

java
Copy
Edit
// Step 1: Create Abstract Loan and Bank Account Interfaces
interface Loan {
void getInterestRate();
}

interface BankAccount {
void getAccountType();
}

// Step 2: Concrete Loan Classes
class HomeLoan implements Loan {
public void getInterestRate() {
System.out.println("Home Loan Interest Rate: 6.5%");
}
}

class CarLoan implements Loan {
public void getInterestRate() {
System.out.println("Car Loan Interest Rate: 7.2%");
}
}

// Step 3: Concrete Bank Account Classes
class SavingsAccount implements BankAccount {
public void getAccountType() {
System.out.println("Savings Account Opened.");
}
}

class CurrentAccount implements BankAccount {
public void getAccountType() {
System.out.println("Current Account Opened.");
}
}

// Step 4: Create Abstract Factory
interface BankFactory {
Loan createLoan();
BankAccount createAccount();
}

// Step 5: Concrete Factories for Different Bank Services
class HomeLoanFactory implements BankFactory {
public Loan createLoan() {
return new HomeLoan();
}

    public BankAccount createAccount() {
        return new SavingsAccount();
    }
}

class CarLoanFactory implements BankFactory {
public Loan createLoan() {
return new CarLoan();
}

    public BankAccount createAccount() {
        return new CurrentAccount();
    }
}

// Step 6: Factory Producer (returns appropriate factory)
class FactoryProducer {
public static BankFactory getFactory(String choice) {
if (choice.equalsIgnoreCase("home")) return new HomeLoanFactory();
else if (choice.equalsIgnoreCase("car")) return new CarLoanFactory();
return null;
}
}

// Step 7: Usage
public class AbstractFactoryPatternBankExample {
public static void main(String[] args) {
// Get Home Loan Factory
BankFactory homeLoanFactory = FactoryProducer.getFactory("home");
Loan homeLoan = homeLoanFactory.createLoan();
BankAccount savingsAccount = homeLoanFactory.createAccount();

        homeLoan.getInterestRate();
        savingsAccount.getAccountType();

        // Get Car Loan Factory
        BankFactory carLoanFactory = FactoryProducer.getFactory("car");
        Loan carLoan = carLoanFactory.createLoan();
        BankAccount currentAccount = carLoanFactory.createAccount();

        carLoan.getInterestRate();
        currentAccount.getAccountType();
    }
}
Output:
yaml
Copy
Edit
Home Loan Interest Rate: 6.5%
Savings Account Opened.
Car Loan Interest Rate: 7.2%
Current Account Opened.
Key Points of Abstract Factory Pattern:
✅ Provides multiple related objects (Loan & BankAccount).
✅ Uses a Factory Producer to decide which factory to return.
✅ Encapsulates multiple product families (Loan & Account).

3️⃣ Comparison Table: Factory vs. Abstract Factory
Feature	Factory Pattern 🚀	Abstract Factory Pattern 🚀
Purpose	Creates a single object type	Creates multiple related objects
Example	Creating different Loan types	Creating Loan + Bank Account
Factory Class	Returns one product	Returns a family of products
Complexity	Simple	More complex (factory of factories)
Flexibility	Less flexible	More flexible
4️⃣ When to Use?
Scenario	Use Factory Pattern?	Use Abstract Factory Pattern?
Need to create different types of one object?	✅ Yes	❌ No
Need to create multiple related objects (families)?	❌ No	✅ Yes
Simple object creation required?	✅ Yes	❌ No
Want to hide object creation logic?	✅ Yes	✅ Yes
🔹 Conclusion
✅ Use Factory Pattern when only one type of product is needed.
✅ Use Abstract Factory Pattern when you need a family of related objects.

💡 Example:

If you just need Loan types, use Factory Pattern.
If you need Loans + Bank Accounts, use Abstract Factory Pattern.

Builder Pattern – Step-by-step construction of complex objects.
When to Use?
When an object has many optional parameters.