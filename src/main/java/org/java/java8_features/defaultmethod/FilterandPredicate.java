package org.java.java8_features.defaultmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterandPredicate {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,10,15);
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return 0;
//            }
//        };
//        ls.stream().filter(predicate).forEach(i->System.out.println(i));
//        Function<Integer,Integer> fun = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer*2;
//            }
//        };
//        ls.stream().filter((x)->x%5==0).map(fun).forEach(i->System.out.println(i));
        ls.stream().filter((x)->x%5==0).forEach(i->System.out.println(i));

        System.out.println(ls.stream().filter((x)->x%5==0).findFirst().orElse(999));
    }
}
