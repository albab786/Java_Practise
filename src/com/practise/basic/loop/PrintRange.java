package com.practise.basic.loop;

import java.util.Scanner;

public class PrintRange {
    public static void getNum(int a,int b,int k){
        for(int i=a;i<=b;i++){
            if(checkNum(i,k)){
                continue;
            }
            System.out.println(i);
        }

    }
    public static boolean checkNum(int n,int k){

        while(n>0){
            int ans=n%10;
            if(ans==k){
                return true;

            }
            n=n/10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first starting point");
        int a=sc.nextInt();
         System.out.println("Enter end point number");
        int b=sc.nextInt();
        System.out.println("Enter k integer number");
        int k=sc.nextInt();
        getNum(a,b,k);
    }
}
