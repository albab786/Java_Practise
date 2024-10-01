package com.practise.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C");
        Collections.sort(words, (a, b) -> a.length() - b.length());

        System.out.println(words);
    }
}
