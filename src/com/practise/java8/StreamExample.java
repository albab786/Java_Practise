package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "api");

        // Use stream to convert each word to uppercase
        List<String> collect = words.stream().map(String::toUpperCase).
                collect(Collectors.toList());
        System.out.println(collect);
    }
}
