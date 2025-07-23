package com.feat.threading;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;






public class FizzBuzzThreads extends Thread {

    private static Object lock = new Object();
    protected static int current = 1;
    private int max;
    private Predicate<Integer> validate;
    private Consumer<Integer> printer;
    int x = 1;

    public FizzBuzzThreads(Predicate<Integer> validate,
                           Consumer<Integer> printer, int max) {

        this.validate = validate;
        this.printer = printer;
        this.max = max;

    }

    public void run() {
        while (true) {
            synchronized(lock){
                if (current > max)
                    return;
                if (validate.test(current)) {
                    printer.accept(current);
                    current++;
                }
            }

        }
    }

}
