package com.feat.exercise;

public class trial2 {


    public static void main(String [] args){
        String s1="multithreading";//aedg
        char [] s1char=s1.toCharArray();
        String s2="tired";//edirt
        char [] s2char= s2.toCharArray();
        int i=0,j=0;
        while(i<s1.length()&& j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
            i++;
        }
        boolean isSeq= j==s2.length();
        System.out.println(" s1 contains s2 in order :" + isSeq);



    }
}
