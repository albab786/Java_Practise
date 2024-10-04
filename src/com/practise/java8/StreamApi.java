package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,-9,4,9,0,70);

//        long count = list.stream().count();
//        System.out.println(count);
//        Stream<Integer> stream = list.stream();
//        Stream<Integer> sorted = stream.sorted();
//        sorted.forEach(n->{
//            System.out.println(n);
//        });
//        Stream<Integer> stream = list.stream();
//        Stream<Integer> integerStream = stream.map(n ->
//                n * 2
//        );
//        integerStream.forEach(n->{
//            System.out.println(n + " ");
//        });
        list.stream().map(n->n*2).forEach(n-> System.out.println(n));
    }
}
