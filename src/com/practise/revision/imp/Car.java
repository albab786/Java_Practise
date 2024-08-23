package com.practise.revision.imp;

public class Car {
    double price;
    String comp_name;

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", comp_name='" + comp_name + '\'' +
                '}';
    }

    public Car(double price, String comp_name) {
        this.price = price;
        this.comp_name = comp_name;
    }
}
