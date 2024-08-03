package org.java.java8_features.defaultmethod;

import java.util.Arrays;
import java.util.List;

/**
 * In Java, a method reference is a shorthand notation of a lambda expression to call a method.
 * It provides a clear and concise way to refer to methods without having to use lambda expressions.
 * Method references are a part of Java's functional programming capabilities, introduced in Java 8 along
 * with lambda expressions.
 */
public class MethodReference {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        list.forEach(System.out::println);
        list.forEach(MethodReference::doubleint);
    }

    public static void doubleint(int i) {
        System.out.println(i*2);
    }
}


/**
 * Method references in Java provide a more concise and readable way to represent certain lambda expressions. They are used to refer to methods directly without having to explicitly call them through lambda expressions. Here are some scenarios where method references are particularly useful:
 *
 * When to Use Method References
 * Simplifying Lambda Expressions:
 *
 * When a lambda expression is just calling a method, a method reference can simplify the code.
 * Example:
 *
 * java
 * Copy code
 * // Lambda expression
 * numbers.forEach(n -> System.out.println(n));
 *
 * // Method reference
 * numbers.forEach(System.out::println);
 * Improving Readability:
 *
 * Method references can make the code more readable by reducing the verbosity of lambda expressions.
 * Example:
 *
 * java
 * Copy code
 * // Lambda expression
 * strings.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
 *
 * // Method reference
 * strings.sort(String::compareToIgnoreCase);
 * Reusing Existing Methods:
 *
 * When you have existing methods that fit the functional interface requirements, using method references can make the code cleaner and avoid boilerplate.
 * Example:
 *
 * java
 * Copy code
 * // Custom comparator method in the Person class
 * class Person {
 *     public static int compareByAge(Person p1, Person p2) {
 *         return Integer.compare(p1.getAge(), p2.getAge());
 *     }
 * }
 *
 * // Using method reference
 * people.sort(Person::compareByAge);
 * Constructor References:
 *
 * When creating new instances of a class, constructor references can be used to simplify the creation process.
 * Example:
 *
 * java
 * Copy code
 * // Lambda expression
 * Supplier<List<String>> listSupplier = () -> new ArrayList<>();
 *
 * // Constructor reference
 * Supplier<List<String>> listSupplier = ArrayList::new;
 * Types of Method References
 * Reference to a Static Method:
 *
 * Syntax: ClassName::staticMethodName
 * Example:
 * java
 * Copy code
 * // Lambda expression
 * Function<Double, Double> sqrt = x -> Math.sqrt(x);
 *
 * // Method reference
 * Function<Double, Double> sqrt = Math::sqrt;
 * Reference to an Instance Method of a Particular Object:
 *
 * Syntax: instance::instanceMethodName
 * Example:
 * java
 * Copy code
 * // Lambda expression
 * Consumer<String> printer = s -> System.out.println(s);
 *
 * // Method reference
 * Consumer<String> printer = System.out::println;
 * Reference to an Instance Method of an Arbitrary Object of a Particular Type:
 *
 * Syntax: ClassName::instanceMethodName
 * Example:
 * java
 * Copy code
 * // Lambda expression
 * Comparator<String> comp = (s1, s2) -> s1.compareToIgnoreCase(s2);
 *
 * // Method reference
 * Comparator<String> comp = String::compareToIgnoreCase;
 * Reference to a Constructor:
 *
 * Syntax: ClassName::new
 * Example:
 * java
 * Copy code
 * // Lambda expression
 * Supplier<List<String>> listSupplier = () -> new ArrayList<>();
 *
 * // Constructor reference
 * Supplier<List<String>> listSupplier = ArrayList::new;
 * Practical Examples
 * Example with List Sorting
 * Suppose we have a list of Person objects and we want to sort them by age:
 *
 * java
 * Copy code
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 *
 * class Person {
 *     private String name;
 *     private int age;
 *
 *     public Person(String name, int age) {
 *         this.name = name;
 *         this.age = age;
 *     }
 *
 *     public int getAge() {
 *         return age;
 *     }
 *
 *     @Override
 *     public String toString() {
 *         return name + " (" + age + ")";
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Person> people = Arrays.asList(
 *             new Person("Alice", 30),
 *             new Person("Bob", 25),
 *             new Person("Charlie", 35),
 *             new Person("Dave", 20)
 *         );
 *
 *         // Sort using lambda expression
 *         List<Person> sortedByAgeLambda = people.stream()
 *             .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
 *             .collect(Collectors.toList());
 *
 *         System.out.println("Sorted by age using lambda:");
 *         sortedByAgeLambda.forEach(System.out::println);
 *
 *         // Sort using method reference
 *         List<Person> sortedByAgeMethodRef = people.stream()
 *             .sorted(Person::compareByAge)
 *             .collect(Collectors.toList());
 *
 *         System.out.println("\nSorted by age using method reference:");
 *         sortedByAgeMethodRef.forEach(System.out::println);
 *     }
 * }
 *
 * // Custom comparator method in Person class
 * class Person {
 *     // ... (previous code)
 *
 *     public static int compareByAge(Person p1, Person p2) {
 *         return Integer.compare(p1.getAge(), p2.getAge());
 *     }
 * }
 * Conclusion
 * Method references in Java can make code more concise and readable when a lambda expression
 * is simply invoking an existing method. Use method references to simplify lambda expressions,
 * improve code readability, and reuse existing methods, fitting the specific context and needs of your code.
 *
 *
 */