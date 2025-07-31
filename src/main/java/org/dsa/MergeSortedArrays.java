package org.dsa;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int [] arr1={1,3,3};
        int [] arr2 ={2,5,6};

        int [] result = new int [arr1.length+ arr2.length];

        int p1=0, p2=0;
        for(int p=0;p<arr1.length+ arr2.length;p++){
            if(p2>=arr2.length || (p1<arr1.length && arr1[p1]<arr2[p2]))
                result[p]=arr1[p1++];
            else
                result[p]=arr2[p2++];
        }

        Arrays.stream(result).forEach(System.out::println);

    }
}
