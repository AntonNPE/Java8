package com.tarasov.predicateTest;

import java.util.function.Predicate;

public class PredicateTestController {

    public static void main(String[] args) {


        Predicate <Integer> predicate = x -> x > 5;
        PredicateTestLogic.predicateTestLogic(predicate,35);
        
    }

}
