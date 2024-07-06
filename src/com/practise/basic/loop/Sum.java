package com.practise.basic.loop;

import java.util.Scanner;

public class Sum {
    public static int getSum(int n){
        int i=1;
        int sum=0;
        while (i<=n){
            sum+=i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char p;
        do {
            System.out.println("Enter a number");
            int a= sc.nextInt();
            System.out.println(getSum(a));
            System.out.println("Press Y/y to continue");
            p=sc.next().charAt(0);
        }while(p=='y' || p=='Y');
    }
}
