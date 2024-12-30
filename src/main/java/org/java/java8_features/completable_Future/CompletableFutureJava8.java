package org.java.java8_features.completable_Future;

//CompletableFuture is a powerful and flexible class in Java's java.util.concurrent package that is
//used for asynchronous programming. It allows you to execute tasks in the background without blocking
//the main thread and provides methods to chain, combine, or compose multiple asynchronous operations.


//Basic Features of CompletableFuture
//Run Asynchronous Tasks:
//Execute tasks without blocking the main thread.
//Chaining Tasks:
//Combine multiple asynchronous tasks using methods like thenApply, thenAccept, or thenRun.
//Combining Results:
//Combine results of two or more asynchronous tasks using methods like thenCombine or allOf.
//Exception Handling:
//Handle errors with methods like exceptionally or handle.
//Custom Executors:
//Use custom thread pools instead of the default ForkJoinPool.


//Key Methods in CompletableFuture
//        Method	Description
//        supplyAsync	Runs a task asynchronously and returns a result.
//        runAsync	Runs a task asynchronously without returning a result.
//        thenApply	Processes and transforms the result of a task.
//        thenAccept	Consumes the result of a task.
//        thenRun	Runs a task after the current task finishes, without accessing its result.
//        thenCombine	Combines results of two tasks.
//        exceptionally	Provides a fallback result in case of an exception.
//        handle	Processes the result of a task and handles exceptions.
//        allOf	Waits for all tasks to complete.
//        anyOf	Waits for any task to complete.

import java.util.concurrent.CompletableFuture;

public class CompletableFutureJava8 {

    public static void main(String[] args) {

        try {
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                return "Hello";
            });
            future.thenAccept((result) -> System.out.println(result + "World"));
//            future.join();
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Welcome to Java");

    }
}
