package com.practise.programming.recursion;

public class oneToN {
    public static void oneToN(int n){
        if(n==100){
            return;
        }
        System.out.print(n+ " ");
        oneToN(n+1);
    }
    public static void main(String[] args) {
        oneToN(1);
    }
}
