package org.java.basics;

public class CallByValue {


    static void modify(int x) {
        x=x+100;
    }

    public static void main(String args[]) {
        int x = 10;
        System.out.println("Value before " + x);
        modify(x);
        System.out.println("Value after " + x);

    }
}
