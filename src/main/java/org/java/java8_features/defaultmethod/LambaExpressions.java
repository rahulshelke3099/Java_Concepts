package org.java.java8_features.defaultmethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Lambda expressions in Java 8 introduce functional programming features to the language,
 * allowing you to write code in a more concise and readable manner.
 * They are essentially a way to create anonymous functions (i.e., functions without a name)
 * that can be passed around as arguments or used to define the behavior of certain methods,
 * especially in contexts involving functional interfaces
 */
public class LambaExpressions {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
// Approach 1:
//        Consumer<Integer> func = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        list.forEach(func);

// Approach 2:
        list.forEach(i->System.out.println(i));












    }
}
