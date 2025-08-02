package com.feat.threading;

public class AnotherThreadExampleMain {


    public static void main(String[] args) {
        int n=50;
        Thread [] threads =  {
                new AnotherThreadExample(i->i%2==0, i-> System.out.println(i),n),
                new AnotherThreadExample(i->i%2!=0, i-> System.out.println(i),n)



                };

        for(Thread t: threads)
            t.start();

    }
}
