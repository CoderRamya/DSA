package com.feat.threading;

import com.sun.jdi.event.ThreadStartEvent;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class AnotherThreadExample extends Thread {
    private static Object lock = new Object();
    private int n;
    private int current;
    private Predicate<Integer> predicate;
    private Consumer<Integer> consumer;



    public  AnotherThreadExample(Predicate<Integer> predicate, Consumer<Integer> consumer, int n){
        this.predicate=predicate;
        this.consumer=consumer;
        this.n=n;
    }

    @Override
    public void run(){
        while(current<n){
            synchronized (lock){
                if(predicate.test(current))
                    consumer.accept(current);
                current++;
            }
        }

    }



}
