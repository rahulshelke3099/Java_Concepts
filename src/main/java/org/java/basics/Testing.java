package org.java.basics;

import java.util.Arrays;

public class Testing {

    public enum Day { MONDAY, TUESDAY,WEDNESDAY }

    public static void main(String args[]){
        char a=10;
        char b=10;
        int c;
        c=a+b;
        System.out.println(c);
        float f=10.0f;
        String ans=a%2==0?"even":"odd";
        Day[] days = Day.values();
        for(Day day:days) {
            System.out.println(day);
        }
        Enum_with_values[] enumvalues= Enum_with_values.values();
        System.out.println(Arrays.asList(Arrays.stream(enumvalues).toArray()));
        System.out.println(Enum_with_values.MONDAY.getValue());
    }
}
