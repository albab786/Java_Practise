package com.practise.oops.abstraction.interfaces;

public class Main implements BMW,Audi {
   public void start(){
        System.out.println("bmw starts");
    }
    public void start1(){
        System.out.println("Audi starts");
    }
    @Override
    public void stop(){
        System.out.println("it stops");
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.start();
        m.start1();
        m.applyBrakes();
        System.out.println(Audi.COMPANY_NAME);
    }

}
