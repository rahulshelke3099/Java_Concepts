package org.java.oops.aggregation;


import java.util.ArrayList;
import java.util.List;

/**
 * In Java, aggregation is a type of association between classes in which one class (the whole or container)
 * contains a reference to another class (the part or component).
 * Aggregation represents a "has-a" relationship, where one class contains objects of another class as part
 * of its internal structure. It is a way to represent the relationship between objects when one object is
 * composed of or contains other objects.
 * <p>
 * Aggregation is typically used to model scenarios where one class represents a larger entity that is
 * composed of smaller, reusable components. These components can exist independently and may be shared
 * among multiple instances of the container class.
 */

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    // Other department-related methods
}

