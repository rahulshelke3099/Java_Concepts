package org.java.java8_features.defaultmethod;

import java.util.Arrays;
import java.util.List;

public class ForEachFeature {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.forEach(i -> {
            System.out.println(i);
        });
    }
}
