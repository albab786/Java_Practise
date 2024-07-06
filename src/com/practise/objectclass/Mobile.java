package com.practise.objectclass;

public class Mobile {
    String cName;
    double price;
    public Mobile(String cName,double price){
        this.cName=cName;
        this.price=price;
    }
    public String toString(){
        return "company name is"+"  "+cName+"  "+"price is"+  +price;
    }

    public static void main(String[] args) {
        Mobile m1=new Mobile("apple",99999);
        Mobile m2 =new Mobile("samsung",1111111);
        Mobile m3 =new Mobile("mi",1111111);
       Mobile arr[]={m1,m2,m3};
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }

    }
}
