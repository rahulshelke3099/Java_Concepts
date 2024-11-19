package org.java.InterviewQuestions.ComparableVSComparator;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 2);
        map.put("key2", 1);
        map.put("key3", 7);
        map.put("key4", 5);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key" + entry.getKey() + " " + "Value " + entry.getValue());
        }

        LinkedHashMap<String,Integer> temp =  map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new)
        );

        System.out.println(temp);
    }

}
