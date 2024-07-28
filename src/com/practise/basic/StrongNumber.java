package com.practise.basic;

public class StrongNumber {
    public static int sumOffactorialOfDigits(int n){
        int sum=0;
        while(n>0){
            int ans=n%10;
            sum=sum+factorial(ans);
            n=n/10;
        }
        return sum;
    }
    public static int factorial(int b){
        int i=1;
        int fac=1;
        while (i<=b){
            fac=fac*i;
            i++;
        }
        return fac;
    }
    public static boolean strongno(int m,int n){
        if(m == sumOffactorialOfDigits(n))
        {
            return true;

        }
        return false;
    }


    public static void main(String[] args) {

        System.out.println();
    }
}
