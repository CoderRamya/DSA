package com.feat.coding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTestFixed {
    public static void main(String[] args) {

        ExecutorService execute = Executors.newFixedThreadPool(2);
        Resource1 resource = new Resource1();
        Thread t1= new Thread(new Task11(resource),"Thread 1");
        Thread t2= new Thread(new Task11(resource),"Thread 2");
        t1.start();
        t2.start();

    }
}

class Task11 implements Runnable {
    private final Resource1 resource;

    public Task11(Resource1 resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.test();
    }
}
class Resource1{
private final Lock objectLock= new ReentrantLock();
private static final  Lock classLock = new ReentrantLock();

public void test(){

    try {
        boolean gotClassLock = classLock.tryLock(1, TimeUnit.SECONDS);
        boolean gotObjectLock = objectLock.tryLock(1, TimeUnit.SECONDS);

        if(gotClassLock && gotObjectLock)
        {
            System.out.println(Thread.currentThread().getName() + "Got both the locks");
            Thread.sleep(2000);
        }
        else{
            System.out.println(Thread.currentThread().getName() + "Couldn't get the locks");
        }

    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}



}
