package org.java.pattern;

public class MyTest {
    public static void main(String[] args) {

        for(int i=5;i>0;i--) {

            for(int p=i;p<5;p++){
                System.out.print(" ");
            }

            for(int q=0;q<i;q++){
                System.out.print("* ");
            }
            System.out.println();


        }

        for(int i=5;i>0;i--) {

            for(int p=i;p<5;p++){
                System.out.print("* ");
            }

            for(int q=0;q<i;q++){
                System.out.print(" ");
            }
            System.out.println();


        }
    }
}
