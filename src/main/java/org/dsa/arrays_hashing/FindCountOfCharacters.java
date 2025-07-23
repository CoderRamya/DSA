package org.dsa.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

public class FindCountOfCharacters
{


    public static void main(String [] args) {

        String s = "success";

        char[] chars = s.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : chars) {
            if (countMap.containsKey(c))
                countMap.put(c, countMap.get(c) + 1);
            else
                countMap.put(c, 1);


        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
