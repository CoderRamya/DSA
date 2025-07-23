package com.feat.exercise;

import java.util.stream.Collectors;

public class trial3 {

    public static void main(String [] args){
        String s ="abcabc1";
        s.chars().distinct().mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());



    }


}
