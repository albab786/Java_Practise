package com.practise.programming.recursion;

public class Palindrome {

    static int sum=0;
    static int reverseNum(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
        return reverseNum(n/10);
    }

    public static boolean isPalindrome(int n){
        if(reverseNum(n)==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
