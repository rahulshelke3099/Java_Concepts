package org.java.java8_features.defaultmethod;

/**
 * Default methods in interfaces, introduced in Java 8, provide a way to add new methods to interfaces
 * without breaking existing implementations. However, there are several limitations and considerations
 * to keep in mind when using default methods:
 *
 * Conflict Resolution:
 *
 * Multiple Inheritance Conflicts: If a class implements multiple interfaces that contain
 * default methods with the same signature, the compiler will throw an error unless the class
 * explicitly overrides the conflicting method.
 *
 * interface InterfaceA {
 *     default void commonMethod() {
 *         System.out.println("InterfaceA");
 *     }
 * }
 *
 * interface InterfaceB {
 *     default void commonMethod() {
 *         System.out.println("InterfaceB");
 *     }
 * }
 *
 * class MyClass implements InterfaceA, InterfaceB {
 *     @Override
 *     public void commonMethod() {
 *         InterfaceA.super.commonMethod(); // Or InterfaceB.super.commonMethod();
 *     }
 * }
 *
 * Ambiguity in the Diamond Problem:
 *
 *     InterfaceA
 *       /    \
 * InterfaceB  InterfaceC
 *       \    /
 *      MyClass
 *
 * Similar to multiple inheritance in other languages, Java interfaces with default methods
 * can lead to ambiguity if not handled properly.
 *
 * interface ParentInterface {
 *     default void display() {
 *         System.out.println("ParentInterface");
 *     }
 * }
 *
 * interface ChildInterface extends ParentInterface {
 *     @Override
 *     default void display() {
 *         System.out.println("ChildInterface");
 *     }
 * }
 *
 * class MyClass implements ChildInterface {
 *     // display() method from ChildInterface is inherited
 * }
 *
 *
 *
 * Cannot Override Object Methods:
 *
 * Default methods cannot override methods from the Object class, such as toString(), equals(), or hashCode()
 *
 * interface MyInterface {
 *     // default String toString() { return "MyInterface"; } // Compilation error
 * }
 *
 *
 * Note :
 * Default Methods in Interfaces
 * Default methods in Java interfaces are defined using the default keyword.
 * Despite the name, default methods are not related to the default (package-private) access level of Java.
 * Instead, they are public and can be accessed from any package where the interface is accessible.
 *
 * Summary
 * In Java 8, default methods in interfaces allow you to provide method implementations within the
 * interface itself. These methods are implicitly public, meaning they can be accessed from any package
 * as long as the interface is accessible. The term "default" in this context refers to the fact that the
 * method has a default implementation, not to its access level.
 *
 *
 */

public interface DefaultMethodFeature {

    void interfaceMethod();
    default void newDefaultMethod() {
        System.out.println("Inside Default Method");
    }
}


// Justification
/**
 * Balancing Abstraction and Implementation
 * While default and static methods do introduce some level of implementation into interfaces,
 * they do not diminish the role of interfaces in providing abstraction. Here's how they maintain balance:
 *
 * Core Abstraction: Interfaces still primarily serve as a contract that defines what
 * methods a class must implement. The abstract methods in interfaces ensure that the core
 * principle of abstraction is upheld.
 *
 * Backward Compatibility: Default methods allow interfaces to evolve without breaking existing
 * implementations. This is crucial for maintaining backward compatibility, especially in large codebases
 * or libraries.
 *
 * Enhanced Flexibility: By allowing method implementations, interfaces can now provide more functionality
 * and reduce the need for utility classes or abstract classes with partial implementations.
 *
 * Practical Example
 * Consider the following example where an interface defines both abstract and default methods:
 *
 * java
 * Copy code
 * public interface Vehicle {
 *     void start(); // Abstract method
 *
 *     default void stop() {
 *         System.out.println("The vehicle is stopping");
 *     }
 *
 *     static void service() {
 *         System.out.println("The vehicle is being serviced");
 *     }
 * }
 *
 * public class Car implements Vehicle {
 *     @Override
 *     public void start() {
 *         System.out.println("The car is starting");
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         Car car = new Car();
 *         car.start(); // Calls the abstract method implementation
 *         car.stop(); // Calls the default method from the interface
 *
 *         Vehicle.service(); // Calls the static method from the interface
 *     }
 * }
 * Conclusion
 * In Java 8 and later versions, interfaces can contain default and static methods,
 * providing some implementation details. However, they still maintain the core concept of abstraction by defining abstract methods that classes must implement. This enhancement adds flexibility and supports backward compatibility while preserving the abstraction principle at the heart of interfaces.
 */