package com.practise.basic.loop;

import java.util.Scanner;

public class ReverseNum {
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char p;
        do {
            System.out.println("Enter a number");
            int a= sc.nextInt();
            System.out.println(getReverse(a));
            System.out.println("Press Y/y to continue");
            p=sc.next().charAt(0);
        }while(p=='y' || p=='Y');
    }
}
