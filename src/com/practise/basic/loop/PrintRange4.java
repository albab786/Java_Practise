package com.practise.basic.loop;

import java.util.Scanner;

public class PrintRange4 {
    public static void printPrime(int a,int b)
    {
        int count=0;
        for (int i=a;i<=b;i++){
            if(i>1 && checkPrime(i) && checkPrime(countdigitSumCondition1(i))){
                count++;
                    System.out.println(i);

            }
        }

    }
    public static boolean checkPrime(int n){
        if(n<2){
            return false;
        }
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

                sum = sum + n % 10;

            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first starting point");
        int a=sc.nextInt();
        System.out.println("Enter end point number");
        int b=sc.nextInt();
        printPrime(a,b);
    }
}
