package com.tarasov.trashCan;

import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

//        simplePredicateTest();
//        flatMapTest();
//        reduceStreamTest();
        comparingMethodTest();
    }

    public static void simpleStreamMapTest() {

        List<String> collected = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
        collected.forEach(System.out::println);

    }

    public static void simplePredicateTest() {
        List<String> stringList = Stream.of("asd", "a1sdf", "2adgfd").
                filter(string -> Character.isDigit(string.charAt(0)))
                .collect(Collectors.toList());
        stringList.forEach(System.out::println);
        stringList.stream();
    }

    public static void flatMapTest(){
        List<String> stringList = Stream.of(Arrays.asList("aaa","bbb","ccc"), Arrays.asList("1111","2222"))
                .flatMap(lists->lists.stream()).filter(string -> Character.isDigit(string.charAt(0)) ).
                        collect(Collectors.toList());
        stringList.forEach(System.out::println);

    }

    public static void arrayStreamTest(){
        Integer [] testArray = {2,6,12,18,3};
        List<Integer> simple = new ArrayList<>();
        simple.add(1);
        simple.add(25);
        List<Integer> list = simple.stream( ).filter(number -> number > 6).collect(Collectors.toList());
    }

    public static void reduceStreamTest(){
        int summ = Stream.of(1,2,3,4).reduce(12,(acc,number) -> acc+number);
        System.out.println(summ);
    }

    public static void comparingMethodTest(){

        List<String> stringList = Arrays.asList("ass","bz","zttttt","p");
        stringList.forEach(System.out::println);
        System.out.println("----------");
        Collections.sort(stringList,Comparator.comparing(st->-st.length()));
        stringList.forEach(System.out::println);
    }
}


