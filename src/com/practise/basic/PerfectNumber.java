package com.practise.basic;

public class PerfectNumber {
    public static int sum(int n){
        int i=1;
        int sum=0;
        while(i<=n/2){
            if(n%i==0){
                sum=sum+i;
            }
            i++;
        }
        return sum;
    }
    public static boolean isPerfect(int n){
        if(sum(n)==n){
            return true;

        }
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }
}
