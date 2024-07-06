package com.practise.basic;

public class ReverseANum {
    public static int reverse(int n){
        int rev=0;
        int rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+ rem;
            n=n/10;
        }
        return rev;
    }
    public static boolean checkPalindrome(int n){
        if(n==reverse(n)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reverse(12456));
        System.out.println(checkPalindrome(141));
    }
}
