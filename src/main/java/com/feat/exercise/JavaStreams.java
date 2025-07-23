package com.feat.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) {

        //IntStream.range(1,10).forEach(System.out::println);

       // IntStream.range(1,10).skip(5).forEach(System.out::println);

        //System.out.println(IntStream.range(1,5).sum());

       //Stream.of("Ava","Aneri","Alberto").sorted().findFirst().ifPresent(System.out::println);

        //Arrays.asList("al","ankit","basha","brent","william","sarika","hans","raj", "sagar").stream().filter(s->s.startsWith("s")).sorted().forEach(System.out::println);

       // Arrays.asList(1,2,3,4,5,6,7,8).stream().mapToInt(x->x*x).average().ifPresent(System.out::println);



        double total = Stream.of(2.3, 4.5, 6.7).reduce(0.0, (a,b)-> a+b);
        System.out.println(total);

        Integer []  arr= {2,8,56,89,12,909,13};
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.stream(arr).forEach(System.out::println);

        String add="ab12we34";
        System.out.println( add.chars().
                filter(c-> Character.isDigit(c))
                        .map(c->Character.getNumericValue(c))
                .sum());


        int sum=0;
        for(char c : add.toCharArray()){
            if(Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }

        }
        System.out.println(sum);

        String reverse ="hello";
        String formatted="";
        for(int i=reverse.length();i>0;i--){
            formatted+=reverse.charAt(i-1);

        }

        System.out.println(formatted);





    }
}
