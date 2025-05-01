package org.java.String_Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {


    }

    public static void approach_1() {
        String str= "this is a java string";
        StringBuilder strbuild = new StringBuilder(str);
        System.out.println(strbuild.reverse());
    }

    public static void approach_2() {
        String str= "this is a java string";
        String new_string = "";

        for(int i=str.length()-1;i>=0;i--) {
            new_string = new_string + str.charAt(i);
        }
        System.out.println(new_string);
    }

    public static void approach_3Stream() {
        String str= "this is a java string";
        System.out.println(Arrays.stream(str.split("")).reduce("",(a,b)->b+a));
    }

    public static void approch_4efficient() {
        String str= "this is a java string";
        char[] ch = str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while (start<end) {
            char temp=ch[end];
            ch[end]=ch[start];
            ch[start]=temp;
            start++;
            end--;

        }
        System.out.println(new String(ch));
    }
}
