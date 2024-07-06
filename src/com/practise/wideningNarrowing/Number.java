package com.practise.wideningNarrowing;

public class Number {
    public static void main(String[] args) {
        //widening
        //it happens automatically
        short a=4;
        int b=a;
        System.out.println(b);

        int n= 175;
        double m=n;
        System.out.println(m);
        char x='@';
        int y=x;
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);
        //Narrowing
        //we have to do it manually
        double c=12.34;
        int d=(int)c;
        System.out.println(c);
        System.out.println(d);
        byte e=100;
        char f=(char)e;
        System.out.println(e);
        System.out.println(f);
        byte g=120;
        byte h=10;
        int i=(g+h);
        System.out.println(i);
    }
}
