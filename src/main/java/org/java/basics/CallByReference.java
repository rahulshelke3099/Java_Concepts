package org.java.basics;

public class CallByReference {

    static void modify(int[] x) {
       x[0]=10;
    }

    public static void main(String args[]) {
        int x[] = new int[]{1,2,3};
        System.out.println("Value before " + x[0]);
        modify(x);
        System.out.println("Value after " + x[0]);

    }
}


//the modification made to the array inside the method modifyArray affects
//the original array arr because both are referencing the same array object.
//However, Java itself is still pass-by-value;
//it's just that the value being passed is a reference to the object

