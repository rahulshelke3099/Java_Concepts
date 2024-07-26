package org.java.oops.aggregation;

/**
 * Aggregation:
 * <p>
 * 1. Strength of Relationship:
 * <p>
 * Aggregation represents a weaker relationship between classes.
 * It implies a "has-a" or "uses-a" relationship, where one class contains a reference to another class, but the objects involved can exist independently.
 * 2. Independence:
 * <p>
 * In aggregation, the "part" class (the one contained within the other) can exist outside of the "whole" class (the one containing the part).
 * The part can have a longer lifespan than the whole, and it may be used by multiple instances of the whole class.
 * 3. Ownership:
 * <p>
 * There is no ownership or strong encapsulation in aggregation. The part does not belong exclusively to the whole.
 * If the whole object is destroyed, the part objects can still exist.
 * Example: An example of aggregation could be a university containing departments. Departments can exist independently and can be part of multiple universities.
 * Composition:
 * <p>
 * Strength of Relationship:
 * Composition represents a stronger relationship between classes.
 * It implies a "whole-part" relationship, where one class (the whole) is composed of other classes (the parts), and the parts cannot exist independently outside of the whole.
 * 2. Independence:
 * <p>
 * In composition, the "part" objects are created and managed by the "whole" class.
 * The parts cannot exist without the whole, and their lifecycles are tightly bound to the whole object.
 * 3. Ownership:
 * <p>
 * Composition implies strong ownership and encapsulation. The part objects are owned and managed exclusively by the whole class.
 * When the whole object is destroyed, the part objects are also destroyed.
 * Example: An example of composition could be a house containing rooms. Rooms are created and managed by the house, and they cannot exist independently. When the house is destroyed, the rooms cease to exist.
 * In summary, the main difference between aggregation and composition lies in the strength of the relationship and ownership. Aggregation represents a weaker, more independent relationship, while composition represents a stronger, ownership-based relationship where the parts are tightly integrated with the whole.
 * The choice between these two relationships depends on the specific design requirements of the software.
 */

import java.util.ArrayList;
import java.util.List;

class Bank {

    private String name;
    private static List<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public void addBranch(Branch branch1) {
        branches.add(branch1);
    }


    // Constructor, getters, setters
}

public class Branch {
    private String name;
    private Bank bank;

    public Branch(String name) {
        this.name = name;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Constructor, getters, setters
}


