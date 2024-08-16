package org.java.InterviewQuestions.ComparableVSComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 * Purpose: The Comparable interface is used to define the natural ordering of objects of a class. If a class implements Comparable, objects of that class can be compared to each other using the compareTo() method. This natural order is usually the order in which the objects should be sorted when no custom sorting logic is provided.
 *
 * Method: The Comparable interface has a single method:
 *
 * java
 * Copy code
 * int compareTo(T o);
 * This method compares the current object with the specified object for order and returns:
 *
 * A negative integer if the current object is less than the specified object.
 * Zero if the current object is equal to the specified object.
 * A positive integer if the current object is greater than the specified object.
 *
 * When to Use: Use Comparable when you have a single, natural way to compare objects.
 * For example, numbers have a natural order (ascending order), and strings have a natural l
 * exicographical order.
 *
 *Comparator
 * Purpose: The Comparator interface is used to define custom ordering. Unlike Comparable, which imposes a natural order on objects, Comparator allows you to define multiple ways to compare objects. This is especially useful when you want to sort the same objects in different ways.
 *
 * Methods: The Comparator interface has two main methods (Java 8 and later):
 *
 * java
 * Copy code
 * int compare(T o1, T o2);
 * boolean equals(Object obj); // This method is inherited from Object and rarely overridden.
 * Additionally, Java 8 introduced several static and default methods in the Comparator interface, such as reversed(), thenComparing(), and comparing().
 *
 * When to Use: Use Comparator when:
 *
 * You want to define multiple ways to compare objects.
 * The natural order of the class does not exist, or you want to override the natural order.
 * You are comparing objects from a class that does not implement Comparable.
 *
 *
 */




//class Student implements Comparable<Student>
class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" +name +"]";
    }

//	public int CompareTo(Student that)
//	{
////		return 0;
//		if(this.age >that.age)
//			return 1;
//		else
//			return -1;
//	}
}


public class Demo {
    public static void main(String[] args){

//    	Comparator<Integer> com=new Comparator<Integer>()
//    	{
//    		public int compare(Integer i,Integer j)
//    		{
//    			if(i%10 >j%10)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};

//    	List<Integer> nums= new ArrayList<>();
//    	nums.add(43);
//    	nums.add(31);
//    	nums.add(72);
//    	nums.add(29);

//    	Comparator<Student> com=new Comparator<Student>()
//    	{
//    		public int compare(Student i,Student j)
//    		{
//    			if(i.age >j.age)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};

        Comparator<Student> com=(i,j) -> i.age > j.age?1:-1;

        List<Student> studs= new ArrayList<>();
        studs.add(new Student(21,"Navin"));
        studs.add(new Student(12,"John"));
        studs.add(new Student(18,"Parul"));
        studs.add(new Student(20,"Kiran"));

//    	Collections.sort(nums);
//    	System.out.println(nums);

        for(Student s:studs)
            System.out.println();

        Collections.sort(studs,com);
        for(Student s: studs)
            System.out.println(s);
    }
}




