package com.practise.multithreading;

public class CarDriver {
    public static void main(String[] args) {
        Car c=new Car();
        Car c2=new Car();
        Car c3=new Car();
        c.start();
        System.out.println("========================");
        c2.start();
        System.out.println("=========================");
        c3.start();

    }
}
