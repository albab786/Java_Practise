package com.practise.bit_manipulation;

public class Swap {
    public static void getSwap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a is"+a);
        System.out.println("b is"+b);
    }

    public static void main(String[] args) {
        int a=4,b=9;
        getSwap(a,b);

    }
}
