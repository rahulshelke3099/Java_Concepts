package org.java.java8_features.completable_Future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureChaining {

    public static void main(String[] args) {
        try {
            CompletableFuture.supplyAsync(()-> "task1 ").thenApply(s -> s + "task2 ").
                    thenApply(p1-> p1+"task3 ").
                    thenApply(d-> d + "task4 ")
                    .thenAccept(result-> System.out.println(result));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
