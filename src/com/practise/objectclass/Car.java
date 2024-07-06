package com.practise.objectclass;

public class Car {
    double price;
    String color;
    String model;
    public Car( double price,String color,String model){
        this.price=price;
        this.color=color;
        this.model=model;
    }
    public String toString(){
        return "price is"+ " "+price+" "+"color is"+" "+color+" "+"model is"+" "+model;
    }

    public static void main(String[] args) {
//        Car c=new Car();
//        System.out.println(c);
//        System.out.println(c.toString());
        Car bmw=new Car(10000,"black","abc");
        System.out.println(bmw);
        Car audi=new Car(9999,"black","XXX");
        System.out.println(audi);
    }
}
