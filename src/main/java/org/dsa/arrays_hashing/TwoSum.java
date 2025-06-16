package org.dsa.arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {



    public static int[] twosum(int [] nums, int target){

        var numMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int search = target-nums[i];
            if(numMap.containsKey(search))
               return new int []{ numMap.get(search),i};
            numMap.put(nums[i],i);

        }
        return null;

    }

    public static void main(String[] args) {
        for(int i:(twosum(new int [] {2, 7, 11, 15},9)))
            System.out.println(i);
    }
}
