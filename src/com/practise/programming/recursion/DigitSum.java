package com.practise.programming.recursion;

public class DigitSum {
    public static int getSum(int n){
        if(n==0){
            return 0;
        }
        return n%10+getSum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(getSum(456));
    }
}
