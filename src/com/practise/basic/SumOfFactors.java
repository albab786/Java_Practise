package com.practise.basic;

public class SumOfFactors {
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

    public static void main(String[] args) {
        System.out.println(sum(28));
    }
}
