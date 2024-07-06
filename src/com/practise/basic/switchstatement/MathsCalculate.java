package com.practise.basic.switchstatement;

import java.util.Scanner;

public class MathsCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int a=sc.nextInt();
        System.out.println("Enter 1 to fact 2 to power 3 for reverse 4 to palindrome check 5 to prime");
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println(factorial(a));
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println(getReverse(a));
                break;
            case 4:
                System.out.println(checkPalindrome(a));
                break;
            case 5:
                System.out.println(checkPrime(a));
                break;
            default:
                System.out.println("you have entered wrong credential");


        }

    }
    public static int factorial(int n){
        int i=1;
        int sum=1;
        while(i<=n){
            sum=sum*i;
            i++;

        }
        return sum;
    }
    public static double powerNum(int a,int b){
        double result=Math.pow(a,b);
        return result;
    }
    public static int getReverse(int n){
        int rev=0;
        int rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static boolean checkPalindrome(int n){
        if(n==getReverse(n)){
            return true;
        }
        return false;
    }
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
}
