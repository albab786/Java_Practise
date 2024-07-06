package com.practise.basic;

import java.util.Scanner;

public class NumberQuestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pls enter the digits ");
        int n=sc.nextInt();
       // printDigits( n);
       // printEvenDigits(n);
//        printConditionDigits1(n);
//        System.out.println(printBiggestDigit(n));
        // System.out.println(printBiggestDifferDigit(n));
//        System.out.println(printDigitSum(n));
     //   System.out.println(countdigitSumCondition1(n));
       // System.out.println(countZeroes(n));
        printLeftToRight(n);
    }
    public static void printDigits(int n){
        while(n>0){
            System.out.println(n%10);
            n=n/10;
        }
    }
    public static void printEvenDigits(int n){
        while(n>0){
            if(n%2==0) {
                System.out.println(n % 10);
            }
            n=n/10;
        }
    }
    public static void printConditionDigits1(int n){
        //n<=5
        while(n>0){
            if(n<=5) {
                System.out.println(n % 10);
            }
            n=n/10;
        }
    }
    public static int printBiggestDigit(int n){
        int biggest=-1;
        while(n>0){
            int res=n%10;
            if(biggest<res) {
                biggest=res;
            }
            n=n/10;
        }
        return biggest;
    }
    public static int biggestDifferDigit(int n){
        int biggest=-1;
        int smallest=9;
        while(n>0){
            int res=n%10;
            if(biggest<res) {
                biggest=res;
            }
            if(smallest>res) {
                smallest=res;
            }
            n=n/10;
        }
        return biggest-smallest;
    }
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
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
    public static int countZeroes(int n){
        int sum=0;
        while(n>0){
            if(n%10==0) {
                sum ++;
            }
            n=n/10;
        }
        return sum;
    }
    public static void printLeftToRight(int n){
        String numberString = Integer.toString(n);
        for (int i = 0; i < numberString.length(); i++) {
            System.out.println(numberString.charAt(i) );
        }
    }


}
