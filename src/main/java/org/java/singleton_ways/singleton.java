//The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that instance.
//However, there are several ways to break the Singleton pattern in Java, and understanding these pitfalls along with the strategies
//to avoid them is crucial to maintaining the integrity of the Singleton.
//
//Ways to Break the Singleton Pattern
//Reflection:
//
//How It Breaks: Java Reflection can be used to change the accessibility of the constructor and create a new instance of the Singleton class,
//even if the constructor is private.
//Example:
//        import java.lang.reflect.Constructor;
//
//public class Singleton {
//    private static final Singleton INSTANCE = new Singleton();
//
//    private Singleton() {
//        // Prevent reflection attacks
//        if (INSTANCE != null) {
//            throw new IllegalStateException("Cannot create another instance");
//        }
//    }
//
//    public static Singleton getInstance() {
//        return INSTANCE;
//    }
//
//    public static void main(String[] args) throws Exception {
//        Singleton instance1 = Singleton.getInstance();
//
//        // Using reflection to break Singleton
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton instance2 = constructor.newInstance();
//
//        System.out.println(instance1);
//        System.out.println(instance2);
//        System.out.println(instance1 == instance2);  // false
//    }
//}
//Serialization/Deserialization:
//
//How It Breaks: When a Singleton class implements Serializable, the object can be serialized and deserialized,
//which creates a new instance of the class, breaking the Singleton.
//
//        Example:
//        import java.io.*;
//
//public class Singleton implements Serializable {
//    private static final Singleton INSTANCE = new Singleton();
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        return INSTANCE;
//    }
//
//    protected Object readResolve() {
//        return INSTANCE;
//    }
//
//    public static void main(String[] args) throws Exception {
//        Singleton instance1 = Singleton.getInstance();
//
//        // Serialize the object
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
//        out.writeObject(instance1);
//        out.close();
//
//        // Deserialize the object
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
//        Singleton instance2 = (Singleton) in.readObject();
//        in.close();
//
//        System.out.println(instance1);
//        System.out.println(instance2);
//        System.out.println(instance1 == instance2);  // false
//    }
//}
//Cloning:
//
//How It Breaks: If the Singleton class implements Cloneable, the clone() method can create a new instance of the class, breaking the Singleton.
//        Example:
//java
//Copy code
//public class Singleton implements Cloneable {
//    private static final Singleton INSTANCE = new Singleton();
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        return INSTANCE;
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    public static void main(String[] args) throws Exception {
//        Singleton instance1 = Singleton.getInstance();
//        Singleton instance2 = (Singleton) instance1.clone();
//
//        System.out.println(instance1);
//        System.out.println(instance2);
//        System.out.println(instance1 == instance2);  // false
//    }
//}
//Multithreading:
//
//How It Breaks: In a multithreaded environment, if two threads enter the getInstance() method simultaneously before the instance is initialized, they may both create instances, breaking the Singleton.
//Example:
//java
//Copy code
//public class Singleton {
//    private static Singleton INSTANCE;
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new Singleton();
//        }
//        return INSTANCE;
//    }
//
//    public static void main(String[] args) {
//        Runnable task = () -> {
//            Singleton instance = Singleton.getInstance();
//            System.out.println(instance);
//        };
//
//        Thread thread1 = new Thread(task);
//        Thread thread2 = new Thread(task);
//
//        thread1.start();
//        thread2.start();
//    }
//}
//Ways to Prevent Breaking of Singleton
//Preventing Reflection:
//
//Solution: To protect against reflection, you can modify the constructor to throw an exception if an attempt is made to create another instance.
//Example:
//java
//Copy code
//private Singleton() {
//    if (INSTANCE != null) {
//        throw new IllegalStateException("Cannot create another instance");
//    }
//}
//Serialization Safe Singleton:
//
//Solution: Implement the readResolve() method to return the existing instance during deserialization.
//        Example:
//java
//Copy code
//protected Object readResolve() {
//    return getInstance();
//}
//Preventing Cloning:
//
//Solution: Override the clone() method to prevent cloning, either by throwing an exception or returning the same instance.
//Example:
//java
//Copy code
//@Override
//protected Object clone() throws CloneNotSupportedException {
//    throw new CloneNotSupportedException("Cannot clone a singleton object");
//}
//Thread-Safe Singleton:
//
//Solution 1: Use synchronized in the getInstance() method, which ensures that only one thread can access the method at a time.
//Solution 2: Use double-checked locking to reduce the overhead of acquiring the lock every time the method is called.
//Solution 3: Use the Bill Pugh Singleton Design (static inner helper class) which is thread-safe by nature.
//        Solution 4: Use an enum to implement Singleton, which is inherently thread-safe and protects against serialization.
//        Examples:
//java
//Copy code
//// Solution 2: Double-checked locking
//public class Singleton {
//    private static volatile Singleton INSTANCE;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (INSTANCE == null) {
//            synchronized (Singleton.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new Singleton();
//                }
//            }
//        }
//        return INSTANCE;
//    }
//}
//
//// Solution 3: Bill Pugh Singleton
//public class Singleton {
//    private Singleton() {}
//
//    private static class SingletonHelper {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    public static Singleton getInstance() {
//        return SingletonHelper.INSTANCE;
//    }
//}
//
//// Solution 4: Enum-based Singleton
//public enum Singleton {
//    INSTANCE;
//    public void doSomething() {
//        // your code here
//    }
//}
//Summary
//Breaking Singleton: Reflection, serialization, cloning, and multithreading can break the Singleton pattern.
//Preventing Breakage:
//Use defensive coding in the constructor to prevent reflection attacks.
//Implement readResolve() to prevent creating new instances during deserialization.
//Override the clone() method to prevent cloning.
//Ensure thread safety using synchronized methods, double-checked locking, or the Bill Pugh Singleton Design.
//Use an enum-based Singleton for a robust, thread-safe, and serialization-safe implementation.
//
//
//
//
//
//
//
//
