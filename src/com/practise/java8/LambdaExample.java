package com.practise.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number->
                System.out.print(number +" "));

    }
}
