package com.practise.basic;

import java.util.Scanner;

public class Fibon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        series(n);
    }
    public static void series(int n){
        int n1=0;
        int n2=1;
        System.out.print(n1 +" "+n2+ " " );
        int i=2;
        while(i<=n){

            int n3=n1+n2;
            System.out.print(n3 + " ");
            n1=n2;
            n2=n3;
            i++;

        }

    }
}
