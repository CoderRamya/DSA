package org.dsa.arrays_hashing;

import java.util.*;

public class GroupAnagram {


    public static List<List<String>> groupAnagram(String [] group)
    {
        Map<String , List<String>> stringMap = new HashMap<>();
        for(String s: group){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            stringMap.computeIfAbsent(sorted,k-> new ArrayList<>()).add(s);

        }

        return new ArrayList<>(stringMap.values());
    }







    public static void main(String[] args) {
        System.out.println(groupAnagram(new String []{"eat","tea","tan","ate","nat","bat"}));
    }
}
