package org.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class reversestring {

    public static void main(String[] args) {
        String s= "Hello World";
        List<String> strList = new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        int i=0;
        for(int j=0; j<s.length();j++)
        {
            if(s.charAt(j)==' ' ) {
                strList.add(s.substring(i, j));
                i=j+1;
            }
        }

        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            for(int k = st.nextToken().length(); k >0; k--){

            }
            System.out.println(st.nextToken());
        }


    }
}
