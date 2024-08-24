package com.practise.programming.array;

public class CharArrayFrequency {
    public static void main(String[] args) {
        char[] a = {'c', 'a', 'c', 'x', 'c', 'A', 'd', 'x', 'X'};
        getFrequency(a);
    }

    public static void getFrequency(char[] c) {
        boolean[] visited = new boolean[c.length];

        for (int i = 0; i < c.length; i++) {
            if (visited[i]) {
                continue;
            }

            int freq = 1;

            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    freq++;
                    visited[j] = true;
                }
            }

            System.out.println("Frequency of " + c[i] + " is " + freq);
        }
    }
}
