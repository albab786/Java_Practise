package com.practise.objectclass;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop l1=new Laptop("hp15","Hp",987.87);
        Laptop l2=new Laptop("hp15","Hp",987.87);
        System.out.println(l1.equals(l2));
        
    }
}
