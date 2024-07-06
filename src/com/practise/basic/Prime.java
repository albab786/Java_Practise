package com.practise.basic;

import java.util.Scanner;

public class Prime {
    public static boolean checkPrime(int n){
        int i=2;
        while (i<=Math.sqrt(n)){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static int countdigitSumCondition1(int n){
        int sum=0;
        while(n>0){
            if(n%10>5) {
                sum = sum + n % 10;
            }
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        System.out.println(checkPrime(n));
    }
}
