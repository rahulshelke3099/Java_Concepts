package org.java.oops.ImmutableClass;


//How to Make a Class Immutable
//To create an immutable class in Java, you need to follow these principles:
//
//Steps to Make a Class Immutable
//Declare the Class as final:
//
//This prevents subclasses from overriding methods and potentially breaking immutability.
//Make All Fields private and final:
//
//Ensure fields cannot be accessed or modified directly, and final ensures the value of the field cannot be reassigned after initialization.
//No Setter Methods:
//
//Avoid providing methods that can modify the fields.
//Initialize All Fields in the Constructor:
//
//Use a constructor to set all fields when the object is created.
//Deep Copy Mutable Fields:
//
//If a field is a mutable object (like a list or map), return a deep copy instead of the original object when accessed via a getter.
//        Example: Immutable Class
import java.util.ArrayList;
import java.util.List;

final class Immutable {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    // Constructor to initialize fields
    public Immutable(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;

        // Create a deep copy of the mutable list to ensure immutability
        this.hobbies = new ArrayList<>(hobbies);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for hobbies (returns a deep copy to preserve immutability)
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }
}
