package org.java.java8_features.defaultmethod;

import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
        Integer result = ls.parallelStream().reduce(0,(a,b)->a+b);
        System.out.println(result);
    }
}
