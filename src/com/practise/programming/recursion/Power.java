package com.practise.programming.recursion;

public class Power {
    public static int getPower(int base ,int pow){
        if(pow==0){
            return 1;
        }
        return base*getPower(base,pow-1);
    }

    public static void main(String[] args) {
        System.out.println(getPower(4,3));
    }
}
