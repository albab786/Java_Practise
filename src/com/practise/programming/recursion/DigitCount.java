package com.practise.programming.recursion;

public class DigitCount {
    public static int getCount(int n){
        if(n==0){
            return 1;
        }
        if (n < 10) {
            return 1;
        }
        return 1+getCount(n/10);

    }

    public static void main(String[] args) {
        System.out.println(getCount(6));
    }
}
