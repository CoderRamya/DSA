package org.dsa.arrays_hashing;


import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int [] nums = {2,4,1,7,8,9};
        int k=2;


        reverse(nums, 0, k-1);
        reverse(nums,k, nums.length-1);
        reverse(nums,0,nums.length-1);
        Arrays.stream(nums).forEach(e-> System.out.print(e +" ,"));

    }

    private static void reverse(int []nums, int start, int end){

        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
