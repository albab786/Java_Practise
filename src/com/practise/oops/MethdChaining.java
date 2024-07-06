package com.practise.oops;

public class MethdChaining {
    public MethdChaining car(){
        System.out.println("this is BMW");
        return this;
    }
    public MethdChaining bike(){
        System.out.println("this is bike");
        return this;
    }
    public MethdChaining truck(){
        System.out.println("this is BMW");
        return this;
    }

    public static void main(String[] args) {
        MethdChaining m=new MethdChaining();
        m.bike().car().truck();  
    }
}
