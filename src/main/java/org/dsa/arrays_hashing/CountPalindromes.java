package org.dsa.arrays_hashing;

public class CountPalindromes {

    public static void main(String[] args) {
        String s="aaa";
        int count =0;
        for(int start =0; start<s.length();start++)
            for(int end = start; end<s.length();end++){
               count+= checkPalindrome(s,start,end)?1:0;
            }

        System.out.println(count);

    }

    private static boolean checkPalindrome(String s, int start, int end){

        while(start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
