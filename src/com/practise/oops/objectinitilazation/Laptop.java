package com.practise.oops.objectinitilazation;

public class Laptop {
    String brand_name;
    String model;
    String storage_type;
    double price;

    public void setVale(String b,String m,String s,double p){
        brand_name="x";
        model=m;
        storage_type=s;
        price=p;
    }
    public void displayDetails(){
        System.out.println("brand name is"+ " " +brand_name);
        System.out.println("model is"+  " " +model);
        System.out.println("storage type"+  " " +storage_type);
        System.out.println("price is"+ " " +price);
    }
}
