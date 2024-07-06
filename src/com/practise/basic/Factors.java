package com.practise.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static ArrayList<Integer> getFactors(int n){
        ArrayList<Integer> list=new ArrayList<>();
        int i=1;
        while(i<n){
            if(n%i==0){
                list.add(i);
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        System.out.println(getFactors(n));
    }
}
