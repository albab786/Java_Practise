package com.practise.programming;

public class PrimeNumber {
    public static void checkPrimeWithCondition(int i,int j){
        for(int k=i;k<=j;k++){
            if(isPrime(k) && isPrime(digitSum(k))){
                System.out.print( k+ " ");
            }
        }
    }
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        int i=2;
        while (i<=Math.sqrt(n)){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        checkPrimeWithCondition(2,23);
    }
}
