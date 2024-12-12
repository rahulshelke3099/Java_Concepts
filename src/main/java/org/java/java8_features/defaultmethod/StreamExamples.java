package org.java.java8_features.defaultmethod;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,6,6,9);

        List<Integer> ls1 = ls.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(ls1);
        System.out.println(ls.stream().collect(Collectors.groupingBy(x->x%2==0?"even":"odd")));
        // filter numbers and
        ls.stream().anyMatch(x->x%2==0);

        List<String> name= Arrays.asList("Anmol","Bhavesh","Cxxvxv","Afddv","Bdvdvdvdw","adada");

        Map<Character,List<String>> namesbasedOnInitials = name.stream()
                .collect(Collectors.groupingBy(s->s.charAt(0)));

        Iterator<Map.Entry<Character,List<String>>> iterator = namesbasedOnInitials.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println( iterator.next().getValue() );
        }

        //longest string in list
        List<String> lst = Arrays.asList("asa","g","ghghgh");
        System.out.println(lst.stream().max(Comparator.comparing(String::length)));


        // count frequency of each word in List
        List<String> lst1 = Arrays.asList("apple","banana","apple","banana","orange");
        System.out.println(lst1.stream().collect(Collectors.groupingBy(String::valueOf,Collectors.counting())));
    }
}
