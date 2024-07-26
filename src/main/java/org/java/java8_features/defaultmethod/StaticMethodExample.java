package org.java.java8_features.defaultmethod;
/**
 * In Java 8, static methods were introduced in interfaces. This allows interfaces to provide utility methods
 * that are related to the interface but do not require an instance of the interface to be called.
 * This can be very useful for creating helper or utility methods that are tied to the interface's functionality.
 *
 * Key Points of Static Methods in Interfaces
 * Static Method Declaration: Static methods in interfaces are defined using the static keyword, similar
 * to static methods in classes.
 *
 * No Inheritance: Static methods in interfaces are not inherited by classes that implement the interface.
 * They can only be called on the interface itself.
 *
 * Use Cases: Static methods are commonly used for utility functions, factory methods, or other operations
 * that logically belong to the interface but do not operate on instance data.
 *
 */
interface MyInterface {
    // A static method in the interface
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }

    // An abstract method (regular method in interfaces)
    void abstractMethod();
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented in MyClass");
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        // Calling the static method of the interface
        MyInterface.staticMethod();

        // Creating an instance of MyClass and calling the abstract method
        MyClass myClass = new MyClass();
        myClass.abstractMethod();

        // Trying to call the static method from an instance (will not compile)
        // myClass.staticMethod();  // This will result in a compile-time error
    }
}

