package com.practise.programming.recursion;

public class SumofSquare {
    public static void getSquare(int n){
        if(n==0){
            return;
        }

         getSquare(n-1);
        System.out.println(n*n);
    }

    public static void main(String[] args) {
        getSquare(100);
    }
}
