package com.feat.threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String [] args){
        RunnableThread rt = new RunnableThread();

       // thread.start();

         Runnable task =()->{
             System.out.println("I am here!");
         };

        Thread thread= new Thread(task);
         thread.start();;
        ExecutorService executor= Executors.newFixedThreadPool(2);
        executor.execute(()-> System.out.println(Thread.currentThread().getName()));
        executor.submit(()-> System.out.println(Thread.currentThread().getName()));

        executor.shutdown();;
    }
}
