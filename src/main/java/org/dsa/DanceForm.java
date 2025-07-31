package org.dsa;

import java.util.Arrays;

public class DanceForm {

    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6,7,8};

        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]= temp;
        }

        Arrays.stream(arr).forEach(System.out::println);

    }
}
