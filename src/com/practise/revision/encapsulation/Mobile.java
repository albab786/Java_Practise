package com.practise.revision.encapsulation;

//Immutable class

final public class Mobile {
    private double price;
    private String model;
    Mobile(double price,String model){
        this.price=price;
        this.model=model;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
