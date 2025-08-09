package org.java.stream.advance;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAdvance1 {

    public static void main(String args[]) {
        sum();
        average();
    }

    public static void sum() {
        //Calculate the total amount of money spent on groceries
        List<Transaction> tr = Arrays.asList(
                new Transaction("groceries", 100),
                new Transaction("fuel", 100),
                new Transaction("groceries", 20),
                new Transaction("fuel", 500),
                new Transaction("groceries", 30)
                );

        int sum = tr.stream().filter((transaction -> transaction.getData().equals("groceries")))
                .mapToInt(Transaction::getI).sum();
        System.out.println(sum);
    }

    public static void average() {
        //Calculate the total amount of money spent on groceries
        List<Transaction> tr = Arrays.asList(
                new Transaction("groceries", 100),
                new Transaction("fuel", 10),
                new Transaction("groceries", 20),
                new Transaction("fuel", 10),
                new Transaction("groceries", 30)
        );

        Map<String,Double> map = tr.stream().collect(Collectors.groupingBy(Transaction::getData,
                Collectors.averagingInt((t)-> t.getI())));
        System.out.println(map);
    }

}
