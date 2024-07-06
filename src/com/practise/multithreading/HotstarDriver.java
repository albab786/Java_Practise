package com.practise.multithreading;

public class HotstarDriver {
    public static void main(String[] args) {
        Hotstar h1=new Hotstar();
        User1 u1=new User1("john",h1);
        User2 u2=new User2("chris",h1);
        User3 u3=new User3("Marks",h1);
        u1.start();
        System.out.println("====================");
        u2.start();
        System.out.println("====================");
        u3.start();

    }
}
