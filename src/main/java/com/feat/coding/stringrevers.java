package com.feat.coding;

import java.util.Comparator;

public class stringrevers {

    public static void main(String[] args) {
        String  s= "mango";
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));

        }
        System.out.println(sb.toString());

        s.chars().boxed().sorted(Comparator.reverseOrder())
        .map(c-> String.valueOf((char) c.intValue())).forEach(System.out::print);
    }
}
