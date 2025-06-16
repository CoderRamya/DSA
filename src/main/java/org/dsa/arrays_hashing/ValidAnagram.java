package org.dsa.arrays_hashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ValidAnagram {


    public static boolean isValidAnagram(String s, String t){
        char [] sortedS = s.toCharArray();
        char [] sortedT = t.toCharArray();
        Arrays.sort(sortedT);Arrays.sort(sortedS);
       return Arrays.equals(sortedT, sortedS);



    }


    public static boolean isValidAnagram1(String s, String t){

        var  sMap= new HashMap<Character, Integer>();
        var tMap = new HashMap<Character, Integer>();
        char [] sChar= s.toCharArray();
        char [] tChar = t.toCharArray();
        for(char c: sChar)
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        for(char c: tChar)
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        return sMap.equals(tMap);



    }



    public static void main (String [] args) {
        System.out.println(isValidAnagram1("racecar","carrace"));
        System.out.println(isValidAnagram1("car","rat"));
    }

}
