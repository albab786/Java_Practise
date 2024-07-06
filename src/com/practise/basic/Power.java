package com.practise.basic;

import java.util.Scanner;

public class Power {
    public static double powerNum(int a,int b){
        double result=Math.pow(a,b);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number first");
        int n=sc.nextInt();
        System.out.println("enter number second");
        int m=sc.nextInt();
        System.out.println(powerNum(n,m));
    }
}
