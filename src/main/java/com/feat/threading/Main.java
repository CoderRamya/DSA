package com.feat.threading;

public class Main {
    public static void main(String [] args){
        RunnableThread rt = new RunnableThread();
        Thread thread= new Thread(rt);
        thread.start();

    }
}
