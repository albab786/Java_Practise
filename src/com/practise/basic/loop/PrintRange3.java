package com.practise.basic.loop;

import java.util.Scanner;

public class PrintRange3 {
    public static void printPrimeAlternate(int a,int b)
    {
        int count=1;
        for (int i=a;i<=b;i++){
            if(checkPrime(i)){
                count++;
                if(count%2!=0) {
                    System.out.println(i);
                }

            }
        }

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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first starting point");
        int a=sc.nextInt();
        System.out.println("Enter end point number");
        int b=sc.nextInt();
        printPrimeAlternate(a,b);
    }
}
