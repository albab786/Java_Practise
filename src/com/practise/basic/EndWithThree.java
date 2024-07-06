package com.practise.basic;

import java.util.Scanner;

public class EndWithThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        calculate(n);
    }
    public static void calculate(int n){
        int i=1;
        int sum=0;
        while(i<=n){
            int ans=i/10;
            if(ans%3==0){
                sum=sum+i;
                System.out.print(i + " ");

            }
            i++;
        }
        System.out.println(sum);
    }
}
