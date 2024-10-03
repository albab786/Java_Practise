package com.practise.java8;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        String arr[]={"john wick","john snow","rock","daven"};
        Predicate<String> abc =(name)->{
            return name.charAt(0)=='j';
        };
        for (String name:arr){
            if(abc.test(name)){
                System.out.println(name);
            }
        }

    }
}
