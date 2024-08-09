package com.practise.programming.recursion;

public class ReverseANum {
    static int sum=0;
    static int reverseNum(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
       return reverseNum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(876));
    }
}
