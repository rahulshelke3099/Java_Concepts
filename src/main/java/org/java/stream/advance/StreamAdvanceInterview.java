package org.java.stream.advance;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAdvanceInterview {

    public static void main(String[] args) {
/**
 //    Find the longest string in a list of strings using Java streams
 List<String> listString = Arrays.asList("rahul", "yogesh", "harichandra", "xv");
 Optional<String> opt = listString.stream().max(Comparator.comparingInt(String::length));
 System.out.println("Longest string " + opt.get());

 //    Find the shortest string in a list of strings using Java streams
 List<String> listString2 = Arrays.asList("rahul", "yogesh", "harichandra", "xv");
 Optional<String> opt2 = listString2.stream().min(Comparator.comparingInt(String::length));
 System.out.println("Shortest string" + opt2.get());

 //    Calculate the average age of a list of Person objects using Java streams:
 List<Employee> persons = Arrays.asList(
 new Employee("Alice", 25),
 new Employee("Bob", 30),
 new Employee("Charlie", 35)
 );
 System.out.println(persons.stream().max(Comparator.comparing(Employee::getAge)));
 System.out.println(persons.stream().mapToInt(Employee::getAge).average().orElse(0));

 //        Merge two sorted lists into a single sorted list using Java streams:

 List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
 List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
 List<Integer> ls = Stream.concat(list1.stream(),list2.stream()).sorted().collect(Collectors.toList());
 System.out.print(ls);

 //   Find the intersection of two lists using Java streams:

 List<Integer> list3 = Arrays.asList(1, 3, 5, 7, 9);
 List<Integer> list4 = Arrays.asList(2, 5, 6, 7, 10);
 List<Integer> inter = list3.stream().filter(list4::contains).collect(Collectors.toList());
 System.out.println(inter);
 **/
        //       Remove duplicates from a list while preserving the order using Java streams:

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        System.out.println(numbersWithDuplicates.stream().distinct().collect(Collectors.toList()));


        // Given a list of transactions, find the sum of transaction amounts for each day using Java streams:

        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
        System.out.println(transactions.stream().collect(Collectors.groupingBy(Transaction::getData,
                Collectors.summingInt(Transaction::getI))));


//    Find the kth smallest element in an array using Java streams:
    int[] array = {4, 2, 7, 1, 5, 3, 6};
    int k = 3; // Find the 3rd smallest element
        System.out.println(Arrays.stream(array).sorted().skip(k-1).findFirst());

 //       Given a list of strings, find the frequency of each word using Java streams:

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        System.out.println(words.stream().collect(Collectors.groupingBy(s -> s,Collectors.counting())));

 //Implement a method to partition a list into two groups based on a predicate using Java streams:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
       Map<Boolean,List<Integer>> evenodd =  numbers.stream().collect(Collectors.partitioningBy(x->x%2==0));
       System.out.println(evenodd.get(true));
        System.out.println(evenodd.get(false));

 //       Count occurrence of a all character in a string using Stream API in Java.
        String s= "this is a string in java";
        System.out.println(s.chars().mapToObj(c->(char)c).filter(c->!Character.isWhitespace(c)).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

//        Merge and Sort Strings
//        Problem:
//        Given two arrays of strings, merge them, sort them alphabetically, and remove any duplicate strings.
//    Output : {"apple", "banana", "cherry", "date", "fig"}

        String[] arr1 = {"apple", "banana", "cherry", "apple"};
        String[] arr2 =  {"banana", "date", "apple", "fig"};

        Stream s1= Arrays.stream(arr1);
        Stream s2= Arrays.stream(arr2);

        System.out.println(Stream.concat(s1,s2).distinct().sorted().collect(Collectors.toList()));

    }
}
