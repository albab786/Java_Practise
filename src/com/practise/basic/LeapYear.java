package com.practise.basic;

import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int y){
        if(y%4==0){
            if(y % 100 != 0 || y % 400 == 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year to check");
        int n=sc.nextInt();
        System.out.println(checkLeapYear(n));
    }
}
