package org.dsa.arrays_hashing;

import java.util.*;

public class ContainsDuplicates {

    public static boolean containsDuplicates(int [] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            if(map.containsKey(i)){
                return true;
            }else{
                map.put(i,1);
            }
        }
        return false;
    }

    public static void main(String args[]){
        var nums = new int[]{1, 2, 3, 4};// tested with {1,2,3,4}, {1,2,2},{}
        List<Integer> num =Arrays.asList(1, 2, 3, 4);


        System.out.println(containsDuplicates( nums));
    }

}
