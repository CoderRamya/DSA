package org.dsa;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class removeduplicates {


    public static void main(String[] args) {
        String s ="hello";
        Set<Character> strSet = new LinkedHashSet<>();

        for(Character c: s.toCharArray()){
            strSet.add(c);
        }
        StringBuilder sb= new StringBuilder();
        for(Character c: strSet)
            sb.append(c);

        System.out.println(sb.toString());
    }
}
