package org.java.InterviewQuestions.ComparableVSComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamInterview {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,3,9,55,67,1,4);
        Optional<Integer> a=list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst();
        System.out.println(a.get());

        String str="aaasdfdvrgrgh";
        List<Character> characters = Arrays.asList('a','b','c','a','i','t','b','y','b');
        System.out.println(characters.stream().collect(Collectors.groupingBy(Character::charValue,Collectors.counting())));

//        Find the longest string in a list of strings using Java streams:
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        System.out.println(strings.stream().max(Comparator.comparing(String::length)));

//        Average age of a list of Person objects using Java streams:
        List<Integer> li = Arrays.asList(1,2,3,4);
        System.out.println(li.stream().collect(Collectors.averagingInt(Integer::intValue)));
    }
}
