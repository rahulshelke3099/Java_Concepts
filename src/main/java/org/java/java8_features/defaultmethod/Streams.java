package org.java.java8_features.defaultmethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream API is used to process collections of objects. A stream in Java is a sequence of objects
 * that supports various methods that can be pipelined to produce the desired result.
 *
 * Use of Stream in Java:
 * The uses of Stream in Java are mentioned below:
 *
 * Stream API is a way to express and process collections of objects.
 * Enable us to perform operations like filtering, mapping, reducing, and sorting.
 *
 */
public class Streams {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(11,2,3,4,5,6);
        Integer result = ls.parallelStream().reduce(0,(a,b)->a+b);
        Stream s =ls.stream().sorted(Integer::compare);
        System.out.println(result);
        s.forEach(System.out::println);
    }
}
