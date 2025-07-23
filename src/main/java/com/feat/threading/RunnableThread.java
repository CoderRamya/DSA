package com.feat.threading;

public class RunnableThread implements Runnable{


    @Override
    public void run() {
        System.out.println("Inside RunnableThread Object" + Thread.currentThread().getName());
    }
}
