package com.practise.programming.recursion;

public class BiggestOfFour {
    public static int getBiggest(int a,int b){
        return a>b?a:b;
    }

    public static void main(String[] args) {
        int a=5, b=4, c=7, d=1;
        int big=getBiggest(a,getBiggest(b,getBiggest(c,d)));
        System.out.println(big);
    }
}
