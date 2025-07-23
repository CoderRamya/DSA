package com.feat.threading;

public class FizzBuzzMain {

    public static void main(String[] args){
        int n=100;
        Thread [] threads ={
                new FizzBuzzThreads(i->i%3==0 && i%5==0,i->System.out.println("FizzBuzz"),n),
                new FizzBuzzThreads(i->i%3==0 ,i->System.out.println("Fizz"),n),
                new FizzBuzzThreads( i->i%5==0,i->System.out.println("Buzz"),n),
                new FizzBuzzThreads(i->i%3!=0 && i%5!=0,i->System.out.println(Integer.toString(i)),n)
        };
        for(Thread thread: threads){
            thread.start();
        }
    }

}
