package org.dsa.arrays_hashing;

import java.util.*;

public class groupanagrams1 {

    public static void main(String[] args) {
        String [] input=new String []{"eat","tea","tan","ate","nat","bat"};
        Map< String, List<String>> anagram = new HashMap<>();

        for(String s : input){
            char [] c= s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            anagram.computeIfAbsent(sorted, k->new ArrayList<String>()).add(s);
        }
        System.out.println(anagram);


    }
}
