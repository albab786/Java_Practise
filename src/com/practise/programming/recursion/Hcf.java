package com.practise.programming.recursion;

public class Hcf {
    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }


    public static int hcfOfThree(int a, int b, int c) {
        return hcf(hcf(a, b), c);
    }

    public static void main(String[] args) {
        System.out.println(hcfOfThree(10,15,25));
    }
}
