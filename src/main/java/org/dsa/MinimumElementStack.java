package org.dsa;

import java.util.Stack;

public class MinimumElementStack {

    public static void main(String[] args) {
        Stack<Integer> unsorted = new Stack<>();
        unsorted.push(3);
        unsorted.push(1);
        unsorted.push(5);
        unsorted.push(4);



        Stack<Integer> minimum= new Stack<>();

    }

    Stack<Integer> unsorted = new Stack<>();
    Stack<Integer> minimum = new Stack<>();


    public void push(Integer i){
        if(minimum.peek()<i)
            minimum.peek();
        unsorted.push(i);
        minimum.push(i);
    }

    public void pop()
    {


    }


}
