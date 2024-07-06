package com.practise.basic;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        even(n);
    }
    public static void even(int n){
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
