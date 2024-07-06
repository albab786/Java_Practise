package com.practise.basic;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        int i=1;
        int sum=1;
        while(i<=n){
            sum=sum*i;
            i++;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
