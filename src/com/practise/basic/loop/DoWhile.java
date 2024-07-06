package com.practise.basic.loop;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char p;
        do {


        System.out.println("Enter a number");
        int a= sc.nextInt();
            System.out.println(getfact(a));
            System.out.println("Press Y/y to continue");
            p=sc.next().charAt(0);
        }while(p=='y' || p=='Y');
    }
    public static long getfact(int n){
        long i=1;
        long res=1;
        while(i<=n){
            res=res*i;
            i++;
        }
        return res;
    }
}
