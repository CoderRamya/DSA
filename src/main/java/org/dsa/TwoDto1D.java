package org.dsa;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoDto1D {

    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,4},{5,6}};
        int[] result = new int[arr.length * arr[0].length];
        int j=0;
        for(int [] a: arr){
            for(int i: a)
            {
                result[j]= i;
                j++;
            }
        }
        Stream.of(result).forEach(e->System.out.println(e));
        Arrays.stream(arr).flatMapToInt(Arrays::stream).forEach(System.out::println);


    }


}
