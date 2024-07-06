package com.practise.oops;

public class InatilizationOfNonStaticVariable{
    String name;
    String dist;
    int pincode;
    public void setName(String name,String dist,int pincode) {
        this.name = name;
        this.dist=dist;
        this.pincode=pincode;
    }

    public static void main(String[] args) {
        //by object ref
        InatilizationOfNonStaticVariable a=new InatilizationOfNonStaticVariable();
//        a.dist="nwd";
//        a.name="john";
//        a.pincode=89898;
//        System.out.println(a.dist+ " "+"  " +a.pincode+a.name);
        //by using non static method
//        a.setName("wick","yor",87876);
//        System.out.println(a.dist+ " "+a.pincode+"  " +a.name);
        //by using constructor

    }
}
