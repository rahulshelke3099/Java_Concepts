package org.java.pattern;

public class Pyramid {

    public static void main(String[] args) {
        for (int p = 0; p < 5; p++) {

            for(int j=0;j<p;j++) {
                System.out.print(" ");
            }
            for(int j=5;j>p;j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 5; i > 0; i--) {

            for(int j=i-1;j>0;j--) {
                System.out.print(" ");
            }
            for(int j=i-1;j<5;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
