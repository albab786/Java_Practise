package com.practise.basic.varargs;

public class Main {
    public static int sum(int...n){
        int sum=0;
        for(int a:n){
            sum+=a;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sum(1,3,4,5,9));
        System.out.println(sum(1,2,3,4));
    }
}
