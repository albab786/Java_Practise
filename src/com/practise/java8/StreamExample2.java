package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,7,10,9,15,17);
        List<Integer> collect = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

        System.out.println(collect);
    }
}
