package com.practise.revision;

public class Car {
    double price;
    String color;
    String brand;
    String country_origin;
    static  String compaany;
    Car(){
        System.out.println("no args constructor");
    }
    Car(double price,String color){
        this.price=price;
        this.color=color;
        System.out.println("constructor");
    }
    Car(double price,String color,String brand,String country_origin) {
        //constructor chaining
         this(price,brand);
         this.brand=brand;
         this.country_origin=country_origin;

    }
    {
        System.out.println("this is Non static block");
    }
    //copy constructor
    Car(Car copy){
        this(copy.price,copy.color,copy.brand,copy.country_origin);

    }
    static{
        compaany="BMW";
        System.out.println("this is static block");
    }
    @Override
    public String toString(){
        return "price is"+price+"color is"+color;
    }

    public static void main(String[] args) {
        Car c=new Car(89897977.9897,"black");
//        Car car2=new Car(c);
//        System.out.println(car2.toString());

    }
}
