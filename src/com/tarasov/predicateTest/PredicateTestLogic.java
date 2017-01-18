package com.tarasov.predicateTest;


import java.util.function.Predicate;

public class PredicateTestLogic {


    public static <T extends Number>  void predicateTestLogic (Predicate <T>  predicate, T  value ) {

        if (predicate.test(value)){
            System.out.println("True");
        }
        else System.out.println("False");

    }
}
