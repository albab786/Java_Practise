package com.practise.programming.recursion;

public class factorial {
    public static int getfactorial(int n){
        if(n==0){
            return 1;
        }
        return n*getfactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(getfactorial(5));
    }
}
