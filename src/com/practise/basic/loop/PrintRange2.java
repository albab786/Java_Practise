package com.practise.basic.loop;

import java.util.Scanner;

public class PrintRange2 {
    public static void printPrime(int a,int b)
    {
        int count=0;
        for (int i=a;i<=b;i++){
            if(checkPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total no of prime "+ count);
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first starting point");
        int a=sc.nextInt();
        System.out.println("Enter end point number");
        int b=sc.nextInt();
        printPrime(a,b);

    }
}
