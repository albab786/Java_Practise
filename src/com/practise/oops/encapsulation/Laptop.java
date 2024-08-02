package com.practise.oops.encapsulation;
//singleton class
public class Laptop {
    static Laptop l=null;
    private Laptop(){

    }
    public static Laptop getInstance(){
        if(l==null){
            l=new Laptop();
            return l;
        }
        return l;
    }
}
