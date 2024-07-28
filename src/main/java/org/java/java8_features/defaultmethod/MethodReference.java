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
