package com.practise.programming.recursion;

public class SumOfNatural {
    public static int getSum(int n ,int j){
        int ans=n;
        if(n>j){
            return ans;
        }
        return ans+getSum(n+1,j);

    }

    public static void main(String[] args) {
        System.out.println(getSum(1,5));
    }
}
