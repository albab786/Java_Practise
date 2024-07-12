package com.practise.programming;

public class Shift0And1 {
    public static void main(String[] args) {
        int n = 1000111;
    }
    public static void shift(int n){
        int arr[]=new int[countDigit(n)-1];
    }

    private static int countDigit(int n) {
        int count=0;
        while(n>0){

            count++;
            n=n/2;
        }
        return count;
    }
}
