package com.practise.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employ e=new Employ();
        System.out.println(e.getId());
        Laptop l2=Laptop.getInstance();
        Laptop l3=Laptop.getInstance();
        Laptop l4=Laptop.getInstance();
        System.out.println(l2+" "+l3+" "+l4);

    }
}
