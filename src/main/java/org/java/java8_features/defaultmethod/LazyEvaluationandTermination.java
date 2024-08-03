package org.java.java8_features.defaultmethod;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluationandTermination {

    public static void main(String[] args) {

        List<Integer> ls= Arrays.asList(12,20,25,30);

        ls.stream().filter(LazyEvaluationandTermination::divisbleBy5)
                .map(LazyEvaluationandTermination::doubleNumber).findFirst().orElse(999);
    }

    public static boolean divisbleBy5(Integer i) {
        System.out.println("Inside filter" + i);
        return i%5==0;
    }

    public static Integer doubleNumber(Integer i) {
        System.out.println("Inside map" + i);
        return i*2;
    }

}
