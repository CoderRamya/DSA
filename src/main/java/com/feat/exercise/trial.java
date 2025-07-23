package com.feat.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class trial {


    public static void main(String [] args){


        List<Integer> num = Arrays.asList(45, 67,23, 78,45,34);
        //System.out.println(num.stream().mapToInt(Integer::intValue).sum());
        //num.stream().distinct().forEach(System.out::println);
        //num.stream().collect(Collectors.toSet()).forEach(System.out::println);
        num.stream().filter(s->s.toString().startsWith("4")).toList().forEach(System.out::println);


        num.stream().filter(i->i%2==0).forEach(System.out::println);

        List<String> names= Arrays.asList("apple", "pear","orange","kiwi","banana");
        names.stream().filter(s->s.length()>4).forEach(System.out::println);
        List<Integer> squareNum = num.stream().map(i->i*i).toList();
        squareNum.stream().forEach(System.out::println);

        String s ="hello";
        char ch='e';
        String result = s.chars()
                .filter((c)->c!=ch)
                .mapToObj(e->String.valueOf((char)e))
                .collect(Collectors.joining());

        System.out.println(result);


        List<Integer> nums= Arrays.asList(3,5,78,435,679,124,678,3509);
        Map<Boolean, Long> partitionedNums=nums.stream().collect(Collectors.partitioningBy(e->e%2==0, Collectors.counting()));
        partitionedNums.entrySet().stream()
                .forEach(e-> System.out.println(e.getKey()? "even   : " +  e.getValue() : "odd  : "  + e.getValue()));



        String special = "hello world @#$%6756";
        System.out.println(special.chars().
                filter(c->!Character.isLetterOrDigit(c))
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining()));

        List<Integer> numsStartingWith1 = nums.stream().
                filter(c-> String.valueOf(c).startsWith("1"))
                .collect(Collectors.toList());
        numsStartingWith1.stream().forEach(e->System.out.println(e));




    }
}
