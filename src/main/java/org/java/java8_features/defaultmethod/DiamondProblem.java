package org.java.java8_features.defaultmethod;

/**
 *
 * Multiple Inheritance
 * It is a feature of an object-oriented concept, where a class can inherit properties of more than one
 * parent class. The feature creates a problem when there exist methods with the same name and signature
 * in both the super-class and sub-class. When we call the method, the compiler gets confused and cannot
 * determine which class method to be called and even on calling which class method gets the priority.
 *
 *
 * class A
 * {
 * public void display()
 * {
 * System.out.println("class A display() method called");
 * }
 * }
 * class B extends A
 * {
 * @Override
 * public void display()
 * {
 * System.out.println("class B display() method called");
 * }
 * }
 * class C extends A
 * {
 * @Override
 * public void display()
 * {
 * System.out.println("class C display() method called");
 * }
 * }
 * //not supported in Java
 * public class D extends B,C
 * {
 * public static void main(String args[])
 * {
 * D d = new D();
 * //creates ambiguity which display() method to call
 * d.display();
 * }
 * }
 *
 * When we compile the above program, it shows the compiler error, as we have shown below.
 *
 * The solution to the diamond problem is default methods and interfaces. We can achieve multiple inheritance
 * by using these two things.
 *
 * The default method is similar to the abstract method. The only difference is that it is defined
 * inside the interfaces with the default implementation. We need not to override these methods.
 * Because they are already implementing these interfaces.
 *
 * The advantage of interfaces is that it can have the same default methods with the same name
 * and signature in two different interfaces. It allows us to implement these two interfaces, from a class.
 * We must override the default methods explicitly with its interface name.
 *
 *
 */
interface DemoInterface1
{
    public default void display()
    {
        System.out.println("the display() method of DemoInterface1 invoked");
    }
}
interface DemoInterface2
{
    public default void display()
    {
        System.out.println("the display() method of DemoInterface2 invoked");
    }
}
public class DiamondProblem implements DemoInterface1, DemoInterface2
{
    public void display()
    {
        DemoInterface1.super.display();
        DemoInterface2.super.display();
    }
    public static void main(String args[])
    {
        DiamondProblem obj = new DiamondProblem();
        obj.display();
    }
}
