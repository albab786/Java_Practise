package com.practise.revision.imp;

import java.io.Serializable;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("cat makes mew sound");

    }

    public void getFact() {
        System.out.println(" she is cute");
    }

    public static void main(String[] args) {
        Animal a = new Cat();
        a.makeSound();
        a.properties();
        System.out.println("========================================================================");
//        Object o=new Cat();
//        Cat c=(Cat) o;
//        c.getFact();
//        c.properties();
//        c.makeSound();
        System.out.println("=====================================================================");
        Cat c1=(Cat) a;
        c1.makeSound();
        c1.properties();
        System.out.println(c1.des);


    }
}
